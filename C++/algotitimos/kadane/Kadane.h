#ifndef __KADANE_H__
#define __KADANE_H__

#include <vector>

template <typename T>
T kadane(std::vector<T> &vetor)
{
	T maxAtual = 0, maxTotal = -1;

	for (long i = 0; i < vetor.size(); i++)
	{
		maxAtual += vetor[i];

		if (maxAtual < 0)
			maxAtual = 0;
		
		if (maxAtual > maxTotal)
			maxTotal = maxAtual;
	}

	return maxTotal;
}

#endif