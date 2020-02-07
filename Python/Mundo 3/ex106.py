from termcolor import colored
from time import sleep

def escreva(txt: str, c=None, on_c=None, at=None):
    n = len(txt)
    print(colored('~' * (n+4), color=c, on_color=on_c, attrs=at))
    print(colored(f'{txt:^{n+4}}', color=c, on_color=on_c, attrs=at))
    print(colored('~' * (n+4), color=c, on_color=on_c, attrs=at))
    
def ajuda():
    comando = input("Função ou biblicoteca > ")
        
    print()
    escreva(f'Acessando o manual do comando "{comando}" (pressione "q" para sair)')
    sleep(3)
    
    help(comando)
    

print()
escreva("SISTEMA DE AJUDA PyHELP")
print()
ajuda()