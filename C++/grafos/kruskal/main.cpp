#include <iostream>
#include "grafo.h"

using namespace std;

int main()
{
	Grafo<char> grafo = Grafo<char>();

	grafo.addVertice('A');
	grafo.addVertice('B');
	grafo.addVertice('C');
	grafo.addVertice('D');
	grafo.addVertice('E');
	grafo.addVertice('F');
	grafo.addVertice('G');

	grafo.addAresta('A', 'B', 7);
	grafo.addAresta('A', 'D', 5);

	grafo.addAresta('B', 'D', 9);
	grafo.addAresta('B', 'C', 8);
	grafo.addAresta('B', 'E', 7);

	grafo.addAresta('C', 'E', 5);

	grafo.addAresta('D', 'E', 15);
	grafo.addAresta('D', 'F', 6);

	grafo.addAresta('E', 'F', 8);
	grafo.addAresta('E', 'G', 9);

	grafo.addAresta('F', 'G', 11);

	grafo.kruskal();

	return 0;
}