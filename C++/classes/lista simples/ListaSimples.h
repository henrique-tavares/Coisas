#ifndef __LISTA_SIMPLES_H__
#define __LISTA_SIMPLES_H__

#include <iostream>
#include <exception>

using namespace std;

template <typename T>
class Lista;

template <typename T>
class Elemento
{
	T valor;
	Elemento<T> *prox;

	Elemento(T valor)
	{
		this->valor = valor;
		this->prox = NULL;
	}

	~Elemento()
	{
		this->prox = NULL;
	}

	friend class Lista<T>;
	friend ostream& operator<<(ostream&, const Lista<T>&);
};

template <typename T>
class Lista
{
private:
	Elemento<T> *primeiro;
	Elemento<T> *ultimo;
	int tam;

public:
	Lista()
	{
		this->primeiro = NULL;
		this->ultimo = NULL;
		this->tam = 0;
	}

	~Lista()
	{
		while(!this->empty())
		{
			this->erase();
		}
	}

	T& operator[](int index)
	{
		if (this->empty())
		{
			throw runtime_error("Lista vazia!");
		}

		if (index < 0 || index >= this->tam)
		{
			throw out_of_range("Índice inválido!");
		}

		Elemento<T> *e = this->primeiro;
		for (int i = 0; i < index; i++, e = e->prox);

		return e->valor;
	}

	int indexOf(T valor)
	{
		if (this->empty())
		{
			throw runtime_error("Lista vazia!");
		}

		int i = 0;
		for (Elemento<T> *e = this->primeiro; e != NULL; e = e->prox, i++)
		{
			if (e->valor == valor)
			{
				return i;
			}
		}

		return -1;
	}

	void addFront(T valor)
	{
		Elemento<T> *newPrimeiro = new Elemento<T>(valor);

		if (this->empty())
		{
			this->primeiro = newPrimeiro;
			this->ultimo = newPrimeiro;
			this->tam++;

			return;
		}

		newPrimeiro->prox = this->primeiro;
		this->primeiro = newPrimeiro;
		
		this->tam++;
	}

	void addBack(T valor)
	{
		Elemento<T> *newUltimo = new Elemento<T>(valor);

		if (this->empty())
		{
			this->ultimo = newUltimo;
			this->primeiro = newUltimo;
			this->tam++;

			return;
		}

		this->ultimo->prox = newUltimo;
		this->ultimo = newUltimo;
		
		this->tam++;
	}

	void insert(int index, T valor)
	{
		if (this->empty())
		{
			throw runtime_error("Lista vazia!");
		}

		if (index < 0 || index >= this->tam)
		{
			throw out_of_range("Índice inválido!");
		}

		Elemento<T> *ant = NULL;
		Elemento<T> *e = this->primeiro;
		for (int i = 0; i < index; i++, ant = e, e = e->prox);

		Elemento<T> *novo = new Elemento<T>(valor);

		if (ant == NULL)
		{
			novo->prox = this->primeiro;
			this->primeiro = novo;
		}
		else
		{
			ant->prox = novo;
			novo->prox = e;
		}

		this->tam++;
	}

	bool exists(T valor)
	{
		if (this->empty())
		{
			return false;
		}

		for (Elemento<T> *e = this->primeiro; e != NULL; e = e->prox)
		{
			if (e->valor == valor)
			{
				return true;
			}
		}

		return false;
	}

	void erase(int index = 0)
	{
		if (this->empty())
		{
			throw runtime_error("Lista vazia!");
		}

		if (index < 0 || index >= this->tam)
		{
			throw out_of_range("Índice inválido!");
		}

		Elemento<T> *ant = NULL;
		Elemento<T> *e = this->primeiro;

		for (int i = 0; i < index; i++, ant = e, e = e->prox);

		Elemento<T> *removed = e;

		if (ant == NULL)
		{
			this->primeiro = this->primeiro->prox;
		}
		else
		{
			ant->prox = e->prox;
		}

		delete removed;
		this->tam--;
	}

	void remove(T valor)
	{
		if (this->empty())
		{
			throw runtime_error("Lista vazia!");
		}

		for (Elemento<T> *ant = NULL, *e = this->primeiro; e != NULL;)
		{
			if (e->valor != valor)
			{
				ant = e;
				e = e->prox;
				continue;
			}

			Elemento<T> *removed = e;

			if (ant == NULL)
			{
				this->primeiro = this->primeiro->prox;
			}
			else
			{
				ant->prox = e->prox;
			}

			e = e->prox;
			
			delete removed;
			this->tam--;
		}
	}

	inline int size()
	{
		return this->tam;
	}

	inline bool empty()
	{
		return (this->tam == 0);
	}

	friend ostream& operator<<(ostream &out, const Lista<T> &lista)
	{
		out << "[ ";
		for (Elemento<T> *e = lista.primeiro; e != NULL; e = e->prox)
		{
			out << e->valor << " ";
		}
		out << "]" << endl;

		return out;
	}

	friend istream& operator>>(istream &in, Lista<T> &lista)
	{
		T valor;
		in >> valor;

		lista.add(valor);

		return in;
	}
};

#endif