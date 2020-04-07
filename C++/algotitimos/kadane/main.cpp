#include <iostream>
#include "Kadane.h"

using namespace std;

int main()
{
	vector<int> vetor = vector<int>();
	vetor.push_back(-2);
	vetor.push_back(5);
	vetor.push_back(-1);
	vetor.push_back(2);
	vetor.push_back(-3);

	cout << "Algorítimo de kanade ";
	cout << "[ ";
	for (int i = 0; i < vetor.size(); i++)
	{
		if (i == 0)
		{
			cout << vetor[i];
			continue;
		}

		cout << ", " << vetor[i];
	}
	cout << " ]";

	cout << " = " << kadane(vetor) << endl << endl;

	return 0;
}