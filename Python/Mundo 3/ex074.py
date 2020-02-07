from random import sample

numeros = tuple(sample(range(101), 5))

print("\nDentre 0 e 100, os 5 valores sorteados foram: ", end='')

for i in numeros: print(i, end=' ')

print(f'\n\nO maior valor sorteado foi {max(numeros)}')
print(f'O menor valor sorteado foi {min(numeros)}', end='\n\n')