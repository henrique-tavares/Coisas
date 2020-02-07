pessoas = list()
peso = list()

while True:
    
    pessoas.append([input("\nNome: ").strip().capitalize(), float(input("Peso: "))])
    
    if pessoas[-1][1] not in peso:
        peso.append(pessoas[-1][1])
    
    while True:
        
        op = input("\nQuer continuar [S/N]? ").upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

print('')
print("=-=" * 15)

print(f'\nAo todo você cadastrou {len(pessoas)}')

maior = max(peso)
menor = min(peso)

print(f'O maior peso foi {maior:.1f}Kg. Peso de ', end='')

for p in pessoas:
    
    if p[1] == maior:
        print(f'[{p[0]}]', end=' ')

print(f'\nO menor peso foi {menor:.1f}Kg. Peso de ', end='')

for p in pessoas:
    
    if p[1] == menor:
        print(f'[{p[0]}]', end=' ')
    
print('\n')