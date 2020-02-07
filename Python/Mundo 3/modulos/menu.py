def clear():
    import os
    
    try:
        os.system('clear') 
    
    except:
        os.system('cls')


def pause():
    input("Pressione ENTER para continuar: ")
    

def linha(char='-', tam=50):
    return char * tam


def cabecalho(txt: str):
    
    from termcolor import colored
    
    print(linha())
    print(colored(f'{txt:^50}', attrs=['bold']))
    print(linha())
    

def menu(opcoes: list):
    
    from termcolor import colored
    
    cabecalho("MENU PRINCIPAL")
    
    for i, item in enumerate(opcoes):
        print(colored(f'{i+1}', 'yellow', attrs=['bold']),'-',colored(f'{item}', 'cyan'))
    
    print(linha())
    
    return leOpcao("Sua opção: ", len(opcoes))
    

def leOpcao(txt: str, qtd: int):
    
    from termcolor import colored
    
    while True:
        
        try:
            n = int(input(colored(txt, 'green')).strip())
            assert n in range(1,qtd+1)
        
        except ValueError:
            print(colored("ERRO: Por favor, digite um número inteiro válido.", 'red'))
        
        except AssertionError:
            print(colored("ERRO: Digite uma opção válida!", 'red'))
        
        except (KeyboardInterrupt, EOFError):
            print(colored("\n\nPrograma interrompido pelo usuário\n", 'red'))
            exit()
        
        else: return n  
          

def acessar(pathArquivo):
    
    from time import sleep
    
    arquivo = open(pathArquivo, mode='r')
    
    cabecalho("LISTA DE PESSOAS CADASTRADAS")
    print(f' {"Nome":<39}{"Idade":<10}')
    print(linha())
    
    for line in arquivo:
        pessoa = {'nome': line.split(sep=';')[0], 'idade': int(line.split(sep=';')[1])}
        print(f' {pessoa["nome"]:<39}{pessoa["idade"]:<10}')
    
    print(linha())
    
    arquivo.close()
    

def cadastrar(pathArquivo):
    
    from time import sleep
    
    try:
        from dado import leInt
    
    except:
        from modulos.dado import leInt
        
    from termcolor import colored
    
    arquivo = open(pathArquivo, mode='a')
    
    pessoa = dict()
    
    cabecalho("Cadastrar pessoa nova")
    sleep(0.5)
    
    try:
        pessoa['nome'] = input("Nome: ").strip()
        pessoa['idade'] = leInt("Idade: ")
        print(linha())
    
    except (KeyboardInterrupt, EOFError):
        print(colored("\n\nPrograma interrompido pelo usuário\n", 'red'))
        exit()
    
    print(f'{pessoa["nome"]};{pessoa["idade"]}', file=arquivo)

    arquivo.close()
    

def sair():

    from time import sleep
    
    cabecalho("Saindo do sistema... Até logo!")
    sleep(1)
    clear()
    exit()
