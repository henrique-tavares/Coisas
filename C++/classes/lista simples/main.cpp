#include <iostream>
#include "ListaSimples.h"

int main()
{
	Lista<int> l1 = Lista<int>();

	cout << l1 << endl;

	l1.addFront(5);
	l1.addBack(6);
	l1.addFront(4);
	l1.addBack(0);
	l1.addBack(2);
	l1.addFront(9);

	cout << l1 << endl;

	l1.insert(0, 8);
	l1.insert(4, -8);
	l1.insert(7, 0);

	cout << l1 << endl;

	l1.erase(0);
	l1.erase(7);
	l1.erase(3);

	cout << l1 << endl;

	l1.remove(0);
	
	cout << l1 << endl;

	cout << "Existe 3? " << l1.exists(3) << endl;
	cout << "Existe 6? " << l1.exists(6) << endl;

	cout << endl;

	l1[0] = 5;

	cout << "l1[0] = " << l1[0] << endl;
	cout << "l1[1] = " << l1[1] << endl;
	cout << "l1[2] = " << l1[2] << endl;
	cout << "l1[3] = " << l1[3] << endl;

	cout << endl;

	cout << " 2 -> " << "l1[" << l1.indexOf(2) << "]" << endl;
	cout << " 6 -> " << "l1[" << l1.indexOf(6) << "]" << endl;
	cout << " 9 -> " << "l1[" << l1.indexOf(9) << "]" << endl;
	cout << " 4 -> " << "l1[" << l1.indexOf(4) << "]" << endl;
	cout << " 0 -> " << "l1[" << l1.indexOf(0) << "]" << endl;

	cout << endl;
	return 0;
}