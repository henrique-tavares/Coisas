def leiaInt(msg: str):
    
    from termcolor import colored
    
    while True:
        
        n = input(msg)
        
        if n.isnumeric():
            return n

        else:
            print(colored("ERRO! Digite um número válido.", 'red'))

n = leiaInt('Digite um número: ')

print(f'\nVocê acabou de digitar o número {n}\n')