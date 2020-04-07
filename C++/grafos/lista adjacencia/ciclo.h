#ifndef __CICLO_H__
#define __CICLO_H__

#include "ListaAdjacencia.h"

template <typename T>
bool Grafo<T>::dfsCiclo(T vertice)
{
	static set<T> checando = set<T>();

	checando.insert(vertice);

	for (auto &vertice : this->vertices.at(vertice))
	{
		if (checando.find(vertice) != checando.end())
		{
			return true;
		}

		if (dfsCiclo(vertice))
		{
			return true;
		}
	}

	checando.erase(vertice);

	return false;
}

template <typename T>
bool Grafo<T>::temCiclo()
{
	for (auto &vertice : this->vertices)
	{
		if (this->dfsCiclo(vertice.first))
		{
			return true;
		}
	}

	return false;
}

#endif