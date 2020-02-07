from time import sleep

def contador(inicio, fim, passo = 1):
    
    if passo == 0:
        print("\n[ERRO] passo inválido\n")
        return 0
    
    print()
    print('-=' * 30)
    print(f'Contagem de {inicio} até {fim} de {passo} em {passo}')
    
    if fim < inicio:
        
        if passo > 0:
            passo *= -1
        
        for i in range(inicio, fim - 1, passo):
            sleep(0.5)
            print(i, end=' ', flush=True)
    
    else:
        for i in range(inicio, fim + 1, passo):
            sleep(0.5)
            print(i, end=' ', flush=True)
    
    sleep(0.5)
    print("FIM!\n")


contador(1, 10)
contador(10, 0, 2)
print('-=' * 30)
print("Agora é a sua vez de personalizar a contagem!")
contador(int(input("Início: ")), int(input("Fim: ")), int(input("Passo: ")))   