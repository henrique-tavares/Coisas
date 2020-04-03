#include <iostream>
#include <exception>
#include "Fila.h"

int main()
{
	Fila<int> f1 = Fila<int>();

	f1.insert(8);
	f1.insert(5);
	f1.insert(3);

	cout << "Primeiro: " << f1.first() << endl
		 << "Último: " << f1.last() << endl
		 << "Tamanho: " << f1.size() << endl
		 << endl;

	f1.remove();

	cout << "Primeiro: " << f1.first() << endl
		 << "Último: " << f1.last() << endl
		 << "Tamanho: " << f1.size() << endl
		 << endl;

	f1.insert(9);

	cout << "Primeiro: " << f1.first() << endl
		 << "Último: " << f1.last() << endl
		 << "Tamanho: " << f1.size() << endl
		 << endl;
		 
	return 0;
}