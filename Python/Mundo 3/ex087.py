matriz = [[],[],[]]
sum_pares = sum_c_3 = 0

for i in range(3):
    for j in range(3):
        
        matriz[i].append(int(input(f'Digite um valor para [{i}, {j}]: ')))
        
        if matriz[i][j] % 2 == 0:
            sum_pares += matriz[i][j]
            
        if j == 2:
            sum_c_3 += matriz[i][j]
            
print('')
print('-=' * 20)
print('')

for i in range(3):
    for j in range(3):
        
        print(f'[{matriz[i][j]:^5}]', end='')
    print()

print('')
print('-=' * 20)
print('')

print(f'A soma de todos os valores pares é {sum_pares}')
print(f'A soma dos valores da terceira coluna é {sum_c_3}')
print(f'O maior valor da segunda linha é {max(matriz[1])}\n')