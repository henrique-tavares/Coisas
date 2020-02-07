numeros = []

print("")
for i in range(5):
    
    numeros.append(float(input(f'Digite um valor para a posição {i}: ')))
    
    if numeros[i].is_integer(): numeros[i] = int(numeros[i])

print('=-=' * 15)
print(f'Você digitou os valores {numeros}')

maior = max(numeros)
menor = min(numeros)

if numeros.count(maior) ==  1:
    print(f'O maior valor digitado foi {maior} na posição {numeros.index(maior)}')

else:
    print(f'O maior valor digitado foi {maior} nas posições ', end='')
    
    for i, n in enumerate(numeros):
        
        if n == maior: print(i, end='... ')
    
print("")

if numeros.count(menor) == 1:
    print(f'O menor valor digitado foi {menor} na posição {numeros.index(menor)}')

else:
    print(f'O menor valor digitado foi {menor} nas posições ', end='')
    
    for i, n in enumerate(numeros):
        
        if n == menor: print(i, end='... ')
    
print('\n')