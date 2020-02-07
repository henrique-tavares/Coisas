numeros = ()
pares = ()

print("")
for i in range(4):
    
    n = int(input("Digite um número: "))
    
    if n % 2 == 0: pares += tuple([n])
    
    numeros += tuple([n])

print(f'\nO valor 9 apareceu {numeros.count(9)} vezes')

if 3 in numeros: print(f'O valor 3 apareceu na {numeros.index(3) + 1}ª posição')

print(f'Os valores pares digitados foram {pares}\n')
