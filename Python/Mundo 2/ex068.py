from random import randint

print("=-=" * 15)
print("VAMOS JOGAR PAR OU ÍMPAR")
print("=-=" * 15, end='\n\n')

cont = 0

while True:
    
    pc = randint(0, 10)
    
    player = int(input("Diga um valor de 0 à 10: "))
    
    if (player < 0 or player > 10):
        
        print("\n[ERRO] Valor fora do intervalo!\n")
        continue
    
    res = pc + player
    
    player = input("Par ou Ímpar [P/I]: ").strip().upper()
    
    if (player not in ['P','I']):
        
        print("\n[ERRO] Valor inválido!\n")
        continue
    
    print("")
    print('-' * 60)
    print(f"Você jogou {res-pc} e o computador {pc}. Total de {res}", end=' ')
    
    if (res % 2 == 0): print("DEU PAR!")
    else: print("DEU ÍMPAR!")
    
    print('-' * 60)
    print("")
    
    if (res % 2 == 0 and player == 'P') or (res % 2 != 0 and player == 'I'):
        
        print("Você VENCEU!")
        print("Vamos jogar novamente...")
        print("=-=" * 15, end='\n\n')
        cont += 1
        
    else:
        print("Você PERDEU!")
        print("=-=" * 15)
        
        if (cont == 0):
            print("\nGAME OVER! Você não venceu nenhuma vez\n")
        
        elif (cont == 1):
            print("\nGAME OVER! Você venceu 1 vez\n")
        
        else:
            print(f"\nGAME OVER! Você venceu {cont} vezes\n")
        
        break
    