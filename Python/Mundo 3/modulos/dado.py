def leDinheiro(txt: str):
    
    from termcolor import colored
    
    while True:
        n = input(txt).strip()
        
        try:
            n = float(n.replace(',','.'))
            
        except:
            print(colored(f'ERRO: "{n}" é um preço inválido', 'red'))
        
        else:
            return n

def leNumero(txt: str):
    
    from termcolor import colored
    
    while True:
        
        try:
            n = float(input(txt).strip())
            
        except KeyboardInterrupt:
            print(colored(f'\nEntrada de dados interrompida pelo usuario', 'red'))
            return None
        
        except:
            print(colored(f'ERRO: "{n}" não é um número válido', 'red'))
        
        else:
            
            if n.is_integer(): return int(n)
            
            else: return n 

def leInt(txt: str):
    
    from termcolor import colored
    
    while True:
        
        try:
            n = int(input(txt).strip())
        
        except (KeyboardInterrupt, EOFError):
            print(colored(f'\nEntrada de dados interrompida pelo usuario', 'red'))
            return None
        
        except:
            print(colored(f'ERRO: Digite um número válido', 'red'))
        
        else:
            return n
        
def leFloat(txt: str):
    
    from termcolor import colored
    
    while True:
        
        try:
            n = float(input(txt).strip())
        
        except KeyboardInterrupt:
            print(colored(f'\nEntrada de dados interrompida pelo usuario', 'red'))
            return None
        
        except:
            print(colored(f'ERRO: Digite um número válido', 'red'))
        
        else:
            return n
            
        