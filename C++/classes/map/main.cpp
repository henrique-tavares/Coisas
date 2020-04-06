#include <iostream>
#include <string>
#include "Map.h"

using namespace std;

int main()
{
	Map<int, string> map = Map<int, string>();

	cout << map << endl;

	map.add(1, "opa");
	map.add(10, "alo");

	try
	{
		map.add(1, "cu");
	}
	catch(const invalid_argument& e)
	{
		cerr << e.what() << '\n';
	}
	
	map.add(3, "alo");
	map.add(5, "aaaaaaa");

	cout << map << endl;

	cout << "map[10] = " << map[10] << endl;

	map[10] = "ALO";

	cout << "map[10] = " << map[10] << endl;

	cout << map << endl;

	try
	{
		cout << "map[12] = " << map[12] << endl;
	}
	catch(const invalid_argument& e)
	{
		cerr << e.what() << '\n';
	}

	map.erase(1);
	map.erase(5);

	cout << map << endl;

	map.add(4, "lel");
	map.add(12, "zerbit");
	map.add(8, "lel");

	cout << map << endl;

	map.remove("lel");
	map.remove("alo");

	cout << map << endl;

	return 0;
}