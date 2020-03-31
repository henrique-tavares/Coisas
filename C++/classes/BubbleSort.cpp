#include <iostream>
#include <string>
#define MAX 10

using namespace std;

class Carro
{
private:
	string nome;
	double preco;

public:
	Carro(string, double);
	Carro() { }
	~Carro() { }

	string getNome();
	void setNome(string);

	double getPreco();
	void setPreco(double);

	friend void sort(Carro[], int);
};

Carro::Carro(string nome, double preco)
{
	this->setNome(nome);
	this->setPreco(preco);
}

string Carro::getNome()
{
	return this->nome;
}

void Carro::setNome(string nome)
{
	this->nome = nome;
}

double Carro::getPreco()
{
	return this->preco;
}

void Carro::setPreco(double preco)
{
	this->preco = preco;
}

void sort(Carro carros[], int tam)
{
	for (int i = 1; i < tam; i++)
	{
		for (int j = i; j > 0; j--)
		{
			if (carros[j].nome.compare(carros[j-1].nome) < 0)
			{
				swap(carros[j], carros[j-1]);
			}
		}
	}
}

int main()
{
	Carro carros[MAX];

	int tam = 0;
	for (int i = 0; i <= MAX; i++)
	{
		if (i == MAX)
		{
			cout << "Array de carros está cheio!" << endl;
			break;
		}

		string nome;
		double preco;
		char resp;

		cout << "Nome do " << i + 1 << "º carro: ";
		do
		{
			getline(cin, nome);

		} while (nome.length() == 0);
		
		cout << "Preco: ";
		cin >> preco;

		carros[i] = Carro(nome, preco);

		tam++;

		cout << endl
			 << "Deseja continuar (S) Sim (N) Não: ";
		cin >> resp;
		cout << endl;

		if (resp != 'S' && resp != 's') break;
	}

	cout << "Exibindo os carros..." << endl << endl;
	for (int i = 0; i < tam; i++)
	{
		cout << "Nome do " << i+1 << "º carro: " << carros[i].getNome() << endl;
		cout << "Preco: " << carros[i].getPreco() << endl;
		cout << endl;
	}

	sort(carros, tam);

	cout << "Exibindo os carros em ordem..." << endl << endl;
	for (int i = 0; i < tam; i++)
	{
		cout << "Nome do " << i+1 << "º carro: " << carros[i].getNome() << endl;
		cout << "Preco: " << carros[i].getPreco() << endl;
		cout << endl;
	}

	return 0;
}