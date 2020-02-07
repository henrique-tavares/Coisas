numeros = []

while len(numeros) < 5:
    
    n = float(input("\nDigite um valor: "))
    
    if n.is_integer(): n = int(n)

    if n in numeros:
        print('\nO valor já está na lista. Tente novamente...')
        continue
    
    if len(numeros) == 0:
        numeros.append(n)
        print("\nValor inicial adicionado...")
    
    else:
        
        for i, v in enumerate(numeros):
            
            if n < v:
                numeros.insert(i, n)
                print(f'\nAdicionado na posição {i} da lista...')
                break
            
        if n not in numeros:
            numeros.append(n)
            print('\nValor adicionado ao final da lista...')

print('')
print('=-=' * 15)
print(f'\nOs valores digitados em ordem foram: {numeros}\n')            