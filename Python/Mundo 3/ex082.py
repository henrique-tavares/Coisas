numeros = []; pares = []; impares = []

while True:
    
    numeros.append(int(input("\nDigite um número: ")))
    
    if numeros[-1] % 2 == 0:
        pares.append(numeros[-1])
    
    else:
        impares.append(numeros[-1])
    
    while True:
        
        op = input("\nQuer continuar [S/N]? ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

print('')
print('=-=' * 15, end='\n\n')
print(f'A lista completa é {sorted(numeros)}')
print(f'A lista de pares é {sorted(pares)}')
print(f'A lista de impares é {sorted(impares)}\n')