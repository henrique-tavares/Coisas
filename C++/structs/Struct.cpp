#include <iostream>
#include <cstring>

using namespace std;

typedef struct Pessoa
{
private:
	char nome[100];
	int idade;

public:
	Pessoa(const char *nome, int idade);

	int getIdade()
	{
		return this->idade;
	}

	char* getNome()
	{
		return this->nome;
	}

} Pessoa_t;

Pessoa_t::Pessoa(const char *nome, int idade)
{
	strcpy(this->nome, nome);
	this->idade = idade;
}

int main()
{
	Pessoa_t p("eu", 9);
	Pessoa_t *p2 = new Pessoa("eu2", 10);

	cout << "Nome: " << p.getNome() << endl
		 << "Idade: " << p.getIdade() << endl;

	cout << "Nome: " << p2->getNome() << endl
		 << "Idade: " << p2->getIdade() << endl;

	return 0;
}