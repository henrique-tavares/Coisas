#ifndef __GRAFO_H__
#define __GRAFO_H__

#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

template <typename T>
class Aresta
{
private:
	T vertice1;
	T vertice2;
	long peso;

public:
	Aresta(T &v1, T &v2, int peso)
	{
		this->vertice1 = v1;
		this->vertice2 = v2;
		this->peso = peso;
	}

	T &getVertice1()
	{
		return this->vertice1;
	}

	T &getVertice2()
	{
		return this->vertice2;
	}

	long getPeso()
	{
		return this->peso;
	}

	bool operator<(const Aresta &other)
	{
		return (this->peso < other.peso);
	}

	bool operator==(const Aresta &other)
	{
		return (
			(this->vertice1 == other.vertice1 && this->vertice2 == other.vertice2) || (this->vertice1 == other.vertice2 && this->vertice2 == other.vertice1)
		);
	}
};

template <typename T>
class Grafo
{
private:
	std::vector<T> vertices;
	std::vector<Aresta<T>> arestas;

public:
	Grafo()
	{
		this->vertices = std::vector<T>();
		this->arestas = std::vector<Aresta<T>>();
	}

	void addVertice(T vertice)
	{
		if (std::find(this->vertices.begin(), this->vertices.end(), vertice) != this->vertices.end())
		{
			throw std::invalid_argument("Vértice existente!");
		}

		this->vertices.push_back(vertice);
	}

	void addAresta(T vertice1, T vertice2, long peso)
	{
		Aresta<T> newAresta = Aresta<T>(vertice1, vertice2, peso);

		if (std::find(this->arestas.begin(), this->arestas.end(), newAresta) != this->arestas.end())
		{
			throw std::invalid_argument("Aresta existente!");
		}

		this->arestas.push_back(newAresta);
	}

	T busca(std::map<T, T> &subset, T &vertice)
	{
		return (subset[vertice] == *this->vertices.end()) ? vertice : busca(subset, subset[vertice]);
	}

	void uniao(std::map<T, T> &subset, T &v1, T &v2)
	{
		T v1Set = this->busca(subset, v1);
		T v2Set = this->busca(subset, v2);
		
		subset[v1Set] = v2Set;
	}

	void kruskal()
	{
		std::vector<Aresta<T>> arvore = std::vector<Aresta<T>>();

		std::sort(this->arestas.begin(), this->arestas.end());

		std::map<T, T> subset = std::map<T, T>();

		for (int i = 0; i < this->vertices.size(); i++)
		{
			subset[this->vertices[i]] = *this->vertices.end();
		}

		for (auto &aresta : this->arestas)
		{
			T v1 = this->busca(subset, aresta.getVertice1());
			T v2 = this->busca(subset, aresta.getVertice2());

			if (v1 != v2)
			{
				arvore.push_back(aresta);
				this->uniao(subset, v1, v2);
			}
		}

		for (auto &aresta : arvore)
		{
			std::cout << "(" << aresta.getVertice1() << ", " << aresta.getVertice2() << ")" << " = " << aresta.getPeso() << std::endl;
		}
	}
};

#endif