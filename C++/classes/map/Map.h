#ifndef __MAP_H__
#define __MAP_H__

#include <iostream>
#include <exception>

template <typename K, typename V>
class Map;

template <typename K, typename V>
class Elemento
{
protected:
	K chave;
	V valor;
	Elemento<K, V> *ant;
	Elemento<K, V> *prox;

	Elemento(K chave, V valor)
	{
		this->chave = chave;
		this->valor = valor;

		this->ant = NULL;
		this->prox = NULL;
	}

	~Elemento()
	{
		this->ant = NULL;
		this->prox = NULL;
	}

	friend class Map<K, V>;
	friend std::ostream &operator<<(std::ostream &, const Map<K, V> &);
};

template <typename K, typename V>
class Map
{
private:
	Elemento<K, V> *primeiro;
	Elemento<K, V> *ultimo;

public:
	Map()
	{
		this->primeiro = NULL;
		this->ultimo = NULL;
	}

	~Map()
	{
	}

	void add(K chave, V valor)
	{
		if (this->existsKey(chave))
		{
			throw std::invalid_argument("Chave existente!");
		}

		Elemento<K, V> *novo = new Elemento<K, V>(chave, valor);

		if (this->empty())
		{
			this->primeiro = novo;
			this->ultimo = novo;

			return;
		}

		novo->ant = this->ultimo;
		this->ultimo->prox = novo;

		this->ultimo = novo;
	}

	V &operator[](K chave)
	{
		for (Elemento<K, V> *e = this->primeiro; e != NULL; e = e->prox)
		{
			if (e->chave == chave)
			{
				return e->valor;
			}
		}

		throw std::invalid_argument("Chave não incontrada!");
	}

	K keyOf(V valor)
	{
		for (Elemento<K, V> *e = this->primeiro; e != NULL; e = e->prox)
		{
			if (e->valor == valor)
			{
				return e->chave;
			}
		}

		throw std::invalid_argument("Valor não incontrado!");
	}

	bool existsKey(K chave)
	{
		for (Elemento<K, V> *e = this->primeiro; e != NULL; e = e->prox)
		{
			if (e->chave == chave)
			{
				return true;
			}
		}

		return false;
	}

	bool existsValue(V valor)
	{
		for (Elemento<K, V> *e = this->primeiro; e != NULL; e = e->prox)
		{
			if (e->valor == valor)
			{
				return true;
			}
		}

		return false;
	}

	void erase(K chave)
	{
		if (this->empty())
		{
			throw std::runtime_error("Map vazio!");
		}

		if (this->primeiro->chave == chave)
		{
			Elemento<K, V> *oldPrimeiro = this->primeiro;

			this->primeiro = this->primeiro->prox;

			if (this->primeiro != NULL)
			{
				this->primeiro->ant = NULL;
			}

			delete oldPrimeiro;
			return;
		}

		if (this->ultimo->chave == chave)
		{
			Elemento<K, V> *oldUltimo = this->ultimo;

			this->ultimo = this->ultimo->ant;

			if (this->ultimo != NULL)
			{
				this->ultimo->prox = NULL;
			}

			delete oldUltimo;
			return;
		}

		for (Elemento<K, V> *e = this->primeiro; e != NULL; e = e->prox)
		{
			if (e->chave == chave)
			{
				Elemento<K, V> *old = e;

				e->ant->prox = e->prox;
				e->prox->ant = e->ant;

				delete old;
				return;
			}
		}
	}

	void remove(V valor)
	{
		if (this->empty())
		{
			throw std::runtime_error("Map vazio!");
		}

		for (Elemento<K, V> *e = this->primeiro; e != NULL;)
		{
			if (e->valor != valor)
			{
				e = e->prox;
				continue;
			}

			if (this->primeiro == e)
			{
				Elemento<K, V> *oldPrimeiro = this->primeiro;

				this->primeiro = this->primeiro->prox;

				if (this->primeiro != NULL)
				{
					this->primeiro->ant = NULL;
				}

				e = e->prox;

				delete oldPrimeiro;
				continue;
			}

			if (this->ultimo == e)
			{
				Elemento<K, V> *oldUltimo = this->ultimo;

				this->ultimo = this->ultimo->ant;

				if (this->ultimo != NULL)
				{
					this->ultimo->prox = NULL;
				}

				e = e->prox;

				delete oldUltimo;
				continue;
			}

			Elemento<K, V> *old = e;

			e->ant->prox = e->prox;
			e->prox->ant = e->ant;

			e = e->prox;

			delete old;
		}
	}

	inline bool empty()
	{
		return (this->primeiro == NULL && this->ultimo == NULL);
	}

	friend std::ostream &operator<<(std::ostream &out, const Map<K, V> &map)
	{
		out << "{ ";

		for (Elemento<K, V> *e = map.primeiro; e != NULL ; e = e->prox)
		{
			if (e == map.ultimo)
			{
				out << e->chave << ": " << e->valor;
				continue;
			}

			out << e->chave << ": " << e->valor << ", ";
		}
		
		out << " }";

		return out;
	}
};

#endif