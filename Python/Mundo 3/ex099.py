from time import sleep

def maior(*numeros: int):
    
    print()
    print('-=' * 50)
    print("Analisando os valores passados...")
    sleep(0.5)
    
    if len(numeros) > 0:
        maior = max(numeros)
    
    else:
        maior = 0
    
    for n in numeros:
        
        print(n, end=' ', flush=True)
        sleep(0.5)
    
    print(f'\nForam informados {len(numeros)} valores ao todo.')
    print(f'O maior valor informado foi {maior}.\n')
    
maior(2, 9, 4, 5, 7, 1)
maior(4, 7, 0)
maior(1, 2)
maior(6)
maior()