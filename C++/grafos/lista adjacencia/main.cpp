#include <iostream>
#include "ListaAdjacencia.h"
#include "dfs.h"
#include "bfs.h"
#include "ciclo.h"

int main()
{
	Grafo<int> g = Grafo<int>();

	g.addVertice(0);
	g.addVertice(1);
	g.addVertice(2);
	g.addVertice(3);
	
	g.addAresta(0, 1);
	g.addAresta(0, 2);	
	g.addAresta(1, 3);	
	g.addAresta(3, 2);	

	cout << g << endl;

	g.dfs(0);

	(g.temCiclo()) ? cout << "Contém ciclo" << endl : cout << "Não contém ciclo" << endl;

	cout << endl;

	return 0;
}