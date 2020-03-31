#include <iostream>

using namespace std;

int myStrLen(const char *str)
{
	int tam;

	for (tam = 0; str[tam] != '\0'; tam++);

	return tam;
}

char* myStrCat(const char *dest, const char *orig)
{
	char *resultado = new char[myStrLen(dest) + myStrLen(orig) + 1];

	int i = 0;

	for (int j = 0; dest[j] != '\0'; j++, i++)
	{
		resultado[i] = dest[j];
	}

	for (int j = 0; orig[j] != '\0'; j++, i++)
	{
		resultado[i] = orig[j];
	}

	resultado[i] = '\0';

	return resultado;
}

int main()
{
	const char *str1 = "abra";
	const char *str2 = "cadabra";

	char *str3 = myStrCat(str1, str2);

	cout << str1 << endl << str2 << endl << str3 << endl << endl;

	return 0;
}