#ifndef __DFS_H__
#define __DFS_H__

#include <iostream>
#include "ListaAdjacencia.h"

template <typename T>
void Grafo<T>::dfs(T vertice, int indent)
{
	if (this->vertices.find(vertice) == this->vertices.end())
	{
		throw invalid_argument("Vértice inexistente!");
	}

	static set<T> checando = set<T>();

	checando.insert(vertice);

	for (int i = 0; i < indent; i++)
	{
		cout << "    ";
	}
	cout << "Entrando no vértice: " << vertice << endl;

	for (auto &it : this->vertices.at(vertice))
	{
		if (checando.find(it) != checando.end())
		{
			for (int i = 0; i < indent; i++)
			{
				cout << "    ";
			}
			cout << "Faz ciclo com o vértice: " << it << endl;
			continue;
		}

		this->dfs(it, indent + 1);
	}

	for (int i = 0; i < indent; i++)
	{
		cout << "    ";
	}
	cout << "Saindo do vértice: " << vertice << endl;

	checando.erase(vertice);
}

#endif