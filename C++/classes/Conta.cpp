#include <iostream>

using namespace std;

class Conta
{
private:
	int numero;
	double saldo;

public:
	Conta(double);
	Conta();
	~Conta() {}

	int getNumero()
	{
		return this->numero;
	}

	double getSaldo()
	{
		return this->saldo;
	}

	bool depositar(double);
	bool sacar(double);
};

Conta::Conta()
{
	this->numero = rand();
	this->saldo = 0;
}

Conta::Conta(double saldo)
{
	this->numero = rand();
	this->saldo = saldo;
}

bool Conta::depositar(double deposito)
{
	if (deposito < 0)
	{
		return false;
	}

	this->saldo += deposito;

	return true;
}

bool Conta::sacar(double saque)
{
	if (saque < 0 || saque > this->saldo)
	{
		return false;
	}

	this->saldo -= saque;

	return true;
}

void foo(Conta &c)
{
	c.depositar(50);
}

int main()
{
	Conta *c = new Conta(100);

	cout << "Número da conta: " << c->getNumero() << endl
		 << "Saldo: " << c->getSaldo() << endl
		 << endl;

	if (c->depositar(56))
	{
		cout << "Depositando..." << endl
			 << "Saldo atual: " << c->getSaldo() << endl
			 << endl;
	}

	if (c->sacar(130))
	{
		cout << "Sacando..." << endl
			 << "Saldo atual: " << c->getSaldo() << endl
			 << endl;
	}

	Conta c2(90);

	cout << "Número da conta: " << c2.getNumero() << endl
		 << "Saldo: " << c2.getSaldo() << endl
		 << endl;

	foo(c2);

	cout << "Depositando..." << endl
		 << "Saldo atual: " << c2.getSaldo() << endl
		 << endl;

	return 0;
}