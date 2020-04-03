#ifndef __FILA_H__
#define __FILA_H__

#include <iostream>
#include <exception>

using namespace std;

template <typename T>
class Fila;

template <typename T>
class Elemento
{
	T valor;
	Elemento *ant;
	Elemento *prox;

	Elemento(T valor)
	{
		this->valor = valor;
		this->ant = NULL;
		this->prox = NULL;
	}

	~Elemento()
	{
		this->ant = NULL;
		this->prox = NULL;
	}

	friend class Fila<T>;
};

template <typename T>
class Fila
{
private:
	Elemento<T> *primeiro;
	Elemento<T> *ultimo;
	int tam;

public:
	Fila()
	{
		this->primeiro = NULL;
		this->ultimo = NULL;
		this->tam = 0;
	}

	~Fila()
	{
		while (!this->empty())
		{
			this->remove();
		}
	}

	void insert(T valor)
	{
		Elemento<T> *newUltimo = new Elemento<T>(valor);

		if (this->empty())
		{
			this->primeiro = newUltimo;
			this->ultimo = newUltimo;

			this->tam++;

			return;
		}

		newUltimo->ant = this->ultimo;
		this->ultimo->prox = newUltimo;

		this->ultimo = newUltimo;

		this->tam++;
	}

	void remove()
	{
		if (this->empty())
		{
			throw runtime_error("A fila está vazia!");
		}

		Elemento<T> *oldPrimeiro = this->primeiro;

		this->primeiro = this->primeiro->prox;

		if (this->primeiro != NULL)
			this->primeiro->ant = NULL;

		delete oldPrimeiro;

		tam--;
	}

	T first()
	{
		if (this->empty())
		{
			throw runtime_error("A fila está vazia!");
		}

		return this->primeiro->valor;
	}

	T last()
	{
		if (this->empty())
		{
			throw runtime_error("A fila está vazia!");
		}

		return this->ultimo->valor;
	}

	int size()
	{
		return this->tam;
	}

	bool empty()
	{
		return (this->tam == 0);
	}
};

#endif