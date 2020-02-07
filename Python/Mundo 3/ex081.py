numeros = []

while True:
    
    numeros.append(float(input("\nDigite um valor: ")))
    
    if numeros[-1].is_integer(): numeros[-1] = int(numeros[-1])
    
    while True:
        
        op = input("\nQuer continuar [S/N]? ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

print(f'\nVocê digitou {len(numeros)} elementos.\n')
print(f'Os valores em ordem decrescente são: {sorted(numeros, reverse=True)}\n')

if 5 in numeros:
    print('O valor 5 faz parte da lista!\n')

else:
    print('O valor 5 não faz parte da lista!\n')