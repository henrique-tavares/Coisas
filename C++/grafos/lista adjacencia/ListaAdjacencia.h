#ifndef __LISTA_ADJACENCIA_H__
#define __LISTA_ADJACENCIA_H__

#include <iostream>
#include <set>
#include <map>
#include <algorithm>

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

	void addVertice(T vertice)
	{
		if (this->vertices.find(vertice) != this->vertices.end())
		{
			throw invalid_argument("Vértice existente!");
		}

		this->vertices[vertice] = set<T>();
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

	int getGrauSaida(T vertice)
	{
		if (this->vertices.find(vertice) == this->vertices.end())
		{
			throw invalid_argument("Vértice inexistente!");
		}

		return this->vertices.at(vertice).size();
	}

	void dfs(T, int = 0);

	void bfs(T);

	bool temCiclo();

private:
	bool dfsCiclo(T);

public:
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
				if (it2 == *it.second.begin())
				{
					cout << it2;
				}
				else
				{
					cout << ", " << it2;
				}
			}

			out << " ]";
		}

		out << "\n}";

		return out;
	}
};

#endif