#include <iostream>
#include <cstring>

using namespace std;

class Animal
{
protected:
	string nome;

public:
	Animal(string nome)
	{
		cout << "Constríndo animal..." << endl;

		this->nome = nome;
	}

	virtual ~Animal()
	{
		cout << "Destruíndo animal..." << endl;
	}

	string getNome()
	{
		return this->nome;
	}

	virtual void emitirSom()
	{
		cout << this->nome << ": ..." << endl;
	}
};

class Cachorro : public Animal
{
private:
	int idade;

public:
	Cachorro(string nome, int idade) : Animal(nome)
	{
		cout << "Construíndo cachorro..." << endl;

		this->idade = idade;
	}

	virtual ~Cachorro()
	{
		cout << "Destruíndo cachorro..." << endl;
	}

	int getIdade()
	{
		return this->idade;
	}

	virtual void emitirSom()
	{
		cout << this->nome << ": Au! Au! Au!" << endl;
	}
};

int main()
{
	Cachorro c = Cachorro("sandália", 3);

	cout << "Nome: " << c.getNome() << endl
		 << "idade: " << c.getIdade() << endl
		 << endl;

	Animal a = Animal("coiso");

	a.emitirSom();
	c.emitirSom();

	cout << endl;

	return 0;
}