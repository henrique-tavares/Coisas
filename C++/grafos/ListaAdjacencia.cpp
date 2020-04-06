#include <iostream>
#include <vector>
#include <set>
#include <map>

using namespace std;

template <typename T>
class Grafo
{
private:
	map<T, set<T>> vertices;

public:
	Grafo()
	{
		this->vertices = map<T, set<T>>();
	}

	void addVertice(T id)
	{
		if (this->vertices.find(id) != this->vertices.end())
		{
			throw invalid_argument("Vértice existente!");
		}

		this->vertices[id] = set<T>();
	}

	void addAresta(T orig, T dest)
	{
		if (this->vertices.find(orig) == this->vertices.end() || this->vertices.find(dest) == this->vertices.end())
		{
			throw invalid_argument("Vértice inexistente!");
		}

		this->vertices.at(orig).insert(dest);
	}

	bool verificaLigacao(T orig, T dest)
	{
		if (this->vertices.find(orig) == this->vertices.end() || this->vertices.find(dest) == this->vertices.end())
		{
			throw invalid_argument("Vértice inexistente!");
		}

		return (this->vertices.at(orig).find(dest) != this->vertices.at(orig).end()) ? true : false;
	}

	friend ostream& operator<<(ostream &out, const Grafo<T> &grafo)
	{
		out << "{";

		for (auto &it : grafo.vertices)
		{
			out << "\n\t";
			out << it.first << ": ";
			out << "[ ";

			for (auto &it2 : it.second)
			{
				cout << it2 << " ";
			}

			out << "] ";
		}

		out << "\n}";

		return out;
	}
};

int main()
{
	Grafo<int> g = Grafo<int>();

	g.addVertice(0);
	g.addVertice(5);
	g.addVertice(15);
	g.addVertice(56);
	g.addVertice(-8);

	g.addAresta(0, 5);
	g.addAresta(0, 15);
	g.addAresta(0, -8);

	g.addAresta(5, 0);
	g.addAresta(5, 56);
	g.addAresta(5, -8);

	g.addAresta(56, 15);
	g.addAresta(56, 0);

	g.addAresta(15, 5);
	g.addAresta(15, -8);

	g.addAresta(-8, 0);
	g.addAresta(-8, 5);
	g.addAresta(-8, 15);
	g.addAresta(-8, 56);

	cout << g << endl;

	return 0;
}