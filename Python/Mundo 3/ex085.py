numeros = [[],[]]

print('')
for i in range(7):
    
    n = int(input(f'Digite o {i+1}º valor: '))
    
    if n % 2 == 0:
        numeros[0].append(n)
    
    else:
        numeros[1].append(n)

print(f'\nPares: {sorted(numeros[0])}')
print(f'Ímpares: {sorted(numeros[1])}\n')