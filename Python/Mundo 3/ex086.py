matriz = [[],[],[]]
maior = 0
tam = 1

print('')
for i in range(3):
    for j in range(3):
        
        matriz[i].append(int(input(f'Digite um valor para [{i}, {j}]: ')))
        
print('')
print('-=' * 20)
print('')
        
for i in range(3):
    for j in range(3):
        
        print(f'[{matriz[i][j]:^5}]', end='')
    
    print('')
print('')
        