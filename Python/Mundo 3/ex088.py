from random import sample
from time import sleep

jogos = list()

print('-' * 20)
print(f'{"MEGA SENA":^20}')
print('-' * 20)

while True:
    
    n = int(input("\nQuatos jogos você quer que eu sorteie? "))
    
    if (n > 0):
        break
    
    print('\n[ERRO] Valor fora do intervalo')

print()
print('-=' * 3, end=' ')
print(f'SORTEANDO {n} JOGOS', end=' ')
print('-=' * 3)

for i in range(n):
    
    jogos.append(sample(range(1,61), 6))
    
    sleep(0.6)
    print(f'Jogo {i+1}: {jogos[i]}')

print('-=' * 5, end=' ')
print('< BOA SORTE >', end=' ')
print('-=' * 3, end='\n\n')