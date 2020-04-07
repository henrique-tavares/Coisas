#ifndef __BFS_H__
#define __BFS_H__

#include <iostream>
#include <queue>
#include "ListaAdjacencia.h"

template <typename T>
void Grafo<T>::bfs(T vertice)
{
	if (this->vertices.find(vertice) == this->vertices.end())
	{
		throw invalid_argument("Vértice inexistente!");
	}

	static set<T> checados = set<T>();
	checados.insert(vertice);

	static queue<T> chamada = queue<T>();

	cout << "Verificando o vértice: " << vertice << " ..." << endl;

	for (auto &it : this->vertices.at(vertice))
	{
		if (checados.find(it) != checados.end())
		{
			continue;
		}

		chamada.push(it);
	}
	
	while (!chamada.empty())
	{
		T verticeAux = chamada.front();
		chamada.pop();
		bfs(verticeAux);
	}
}

#endif