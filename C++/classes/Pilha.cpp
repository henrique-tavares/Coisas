#include <iostream>
#include <string>

using namespace std;

template <typename Type>
class Pilha;

template <typename Type>
class Elemento
{
	Type valor;
	Elemento<Type> *ant;

	Elemento(Type valor)
	{
		this->valor = valor;
		this->ant = NULL;
	}

	~Elemento()
	{
		this->ant = NULL;
	}

	friend class Pilha<Type>;
};

template <typename Type>
class Pilha
{
private:
	Elemento<Type> *topo;
	int tamanho;

public:
	Pilha()
	{
		this->topo = NULL;
		this->tamanho = 0;
	}

	~Pilha()
	{
		while (!this->empty())
		{
			this->pop();
		}
	}

	void push(Type valor)
	{
		Elemento<Type> *newTopo = new Elemento<Type>(valor);

		this->tamanho++;

		if (this->empty())
		{
			this->topo = newTopo;
			return;
		}

		newTopo->ant = this->topo;
		this->topo = newTopo;
	}

	void pop()
	{
		if (this->empty())
		{
			throw runtime_error("A pilha está vazia!");
		}

		Elemento<Type> *oldTopo = this->topo;
		this->topo = this->topo->ant;

		this->tamanho--;

		delete oldTopo;
	}

	Type peek()
	{
		if (this->empty())
		{
			throw runtime_error("A pilha está vazia!");
		}

		return this->topo->valor;
	}

	bool empty()
	{
		return (this->tamanho == 0);
	}

	int getTamanho()
	{
		return this->tamanho;
	}
};

int main()
{
	Pilha<string> pilha = Pilha<string>();

	try
	{
		cout << "Topo: " << pilha.peek() << endl;
	}
	catch(const runtime_error& e)
	{
		cerr << e.what() << '\n';
	}

	try
	{
		pilha.pop();
	}
	catch(const runtime_error& e)
	{
		cerr << e.what() << '\n';
	}


	pilha.push("a");
	pilha.push("opa");
	pilha.push("alo");

	cout << "Topo: " << pilha.peek() << endl;

	pilha.pop();

	cout << "Topo: " << pilha.peek() << endl;

	pilha.push("nuuuu");

	cout << "Topo: " << pilha.peek() << endl;

	cout << "Tamanho:" << pilha.getTamanho() << endl;

	return 0;
}