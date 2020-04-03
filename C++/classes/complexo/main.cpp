#include <iostream>
#include "Complexo.h"

int main()
{
	Complexo c1, c2;

	cin >> c1;
	c2 = c1;

	cout << "c1 = " << c1 << endl;
	cout << "c2 = " << c2 << endl;

	c2.setReal(0);
	c2.setImag(1);

	cout << endl;
	cout << "c1 = " << c1 << endl;
	cout << "c2 = " << c2 << endl;

	cout << endl;
	cout << "c1 + c2 = " << c1 + c2 << endl;
	cout << "c1 - c2 = " << c1 - c2 << endl;
	cout << "c1 * c2 = " << c1 * c2 << endl;
	cout << "c1 / c2 = " << c1 / c2 << endl;
	cout << endl;

	return 0;
}