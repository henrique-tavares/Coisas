#include <iostream>
#include <string>
#include "Pilha.h"

using namespace std;

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