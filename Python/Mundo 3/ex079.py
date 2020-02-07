numeros = []

while True:
    
    n = float(input("\nDigite um valor: "))
    
    if n.is_integer(): n = int(n)
    
    if n not in numeros: 
        print('\nValor adicionado com sucesso...')
        numeros.append(n)
    
    else:
        print('\nValor já está na lista...')
    
    while True:
        
        op = input('\nQuer continuar [S/N]: ').strip().upper() 
        
        if op in ['S', 'N']: break
    
    if op == 'N': break

print('')
print('=-=' * 15, end='\n\n')
print(f'Você digitou os valores {sorted(numeros)}\n')