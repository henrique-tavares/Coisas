from random import choice
from time import sleep

jokenpo = ['Pedra', 'Papel', "Tesoura"]

print('''
Suas opções:
[ 0 ] Pedra
[ 1 ] Papel
[ 2 ] Tesoura''')

player = int(input("Qual a sua jogada? "))

pc = choice(jokenpo)

if (player > 2 or player < 0):
    print("Opção inválida. Tente novamente")

else:
    
    sleep(0.5)
    print("\nJO")
    sleep(0.5)
    print("KEN")
    sleep(0.5)
    print("PO!!!\n")
    
    print("=-=" * 10)
    print("Computador jogou {}".format(pc))
    print("Player jogou {}".format(jokenpo[player]))
    print("=-=" * 10)
    
       
    if (pc == 'Pedra'):
        
        if (jokenpo[player] == 'Pedra'):
            print("EMPATE")
        
        elif (jokenpo[player] == 'Papel'):
            print("PLAYER GANHA")
        
        elif (jokenpo[player] == 'Tesoura'):
            print("COMPUTADOR GANHA")
            
    elif (pc == 'Papel'):
        
        if (jokenpo[player] == 'Pedra'):
            print("COMPUTADOR GANHA")
        
        elif (jokenpo[player] == 'Papel'):
            print("EMPATE")
        
        elif (jokenpo[player] == 'Tesoura'):
            print("PLAYER GANHA")
        
        
    elif (pc == 'Tesoura'):
        
        if (jokenpo[player] == 'Pedra'):
            print("PLAYER GANHA")
        
        elif (jokenpo[player] == 'Papel'):
            print("COMPUTADOR GANHA")
        
        elif (jokenpo[player] == 'Tesoura'):
            print("EMPATE")
            
print("")