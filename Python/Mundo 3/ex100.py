from random import sample
from time import sleep

def sorteia(lista: list, qtd: int = 5):
    
    lista.clear()
    lista += sample(range(1,101), qtd)
    
    print(f'\nSorteando {qtd} valores da lista: ', end='')
    for n in lista:
        sleep(0.3)
        print(n, end=' ', flush=True)
    
    sleep(0.3)
    print("PRONTO!")


def somaPar(lista: list):
    
    soma = 0
    
    for n in lista:
        
        if n % 2 == 0:
            soma += n
    
    print(f'\nSomando os valores pares de {lista}, temos {soma}')

numeros = list()
sorteia(numeros)
somaPar(numeros)
print()