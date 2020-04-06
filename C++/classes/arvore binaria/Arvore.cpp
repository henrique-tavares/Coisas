#include <iostream>

using namespace std;

enum Ordem
{
	RED,
	ERD,
	EDR
};

template <typename T>
class Arvore;

template <typename T>
class Node
{
protected:
	T valor;
	int qtd;
	Node<T> *esq;
	Node<T> *dir;

	Node(T valor)
	{
		this->valor = valor;
		int qtd = 0;
		this->esq = NULL;
		this->dir = NULL;
	}

	~Node()
	{
		this->esq = NULL;
		this->dir = NULL;
	}

	friend class Arvore<T>;
};

template <typename T>
class Arvore
{
private:
	Node<T> *raiz;

public:
	Arvore()
	{
		this->raiz = NULL;
	}

	virtual ~Arvore()
	{
		delete raiz;
	}

	void add(T valor)
	{
		if (this->empty())
		{
			Node<T> *novo = new Node<T>(valor);
			this->raiz = novo;
		}
		else
		{
			this->addAux(this->raiz, valor);
		}
	}

	void addAux(Node<T> *node, T valor)
	{
		if (valor == node->valor)
		{
			node->qtd++;
			return;
		}

		if (valor < node->valor)
		{
			if (node->esq == NULL)
			{
				Node<T> *novo = new Node<T>(valor);

				node->esq = novo;
				return;
			}

			addAux(node->esq, valor);
		}

		if (valor > node->valor)
		{
			if (node->dir == NULL)
			{
				Node<T> *novo = new Node<T>(valor);

				node->dir = novo;
				return;
			}

			addAux(node->dir, valor);
		}
	}

	inline bool empty()
	{
		return (this->raiz == NULL);
	}

	void imprimir(Ordem ordem)
	{
		cout << "[ ";

		switch (ordem)
		{
		case Ordem::RED:
			this->preOrdem(this->raiz);
			break;

		case Ordem::ERD:
			this->emOrdem(this->raiz);
			break;

		case Ordem::EDR:
			this->posOrdem(this->raiz);
			break;
		}

		cout << "]" << endl;
	}

	void preOrdem(Node<T> *node)
	{
		cout << node->valor << " ";

		if (node->esq != NULL)
		{
			preOrdem(node->esq);
		}

		if (node->dir != NULL)
		{
			preOrdem(node->dir);
		}
	}

	void emOrdem(Node<T> *node)
	{
		if (node->esq != NULL)
		{
			emOrdem(node->esq);
		}

		cout << node->valor << " ";

		if (node->dir != NULL)
		{
			emOrdem(node->dir);
		}
	}

	void posOrdem(Node<T> *node)
	{
		if (node->esq != NULL)
		{
			posOrdem(node->esq);
		}

		if (node->dir != NULL)
		{
			posOrdem(node->dir);
		}

		cout << node->valor << " ";
	}
};

int main()
{
	Arvore<char> arvore = Arvore<char>();

	arvore.add('F');
	arvore.add('B');
	arvore.add('A');
	arvore.add('D');
	arvore.add('C');
	arvore.add('E');
	arvore.add('G');
	arvore.add('I');
	arvore.add('H');

	arvore.imprimir(Ordem::RED);
	arvore.imprimir(Ordem::ERD);
	arvore.imprimir(Ordem::EDR);

	return 0;
}