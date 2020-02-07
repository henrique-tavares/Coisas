from termcolor import colored
from random import randint

pc = randint(0, 10)
player = []
cont = 0

print("\nSou seu computador...\nAcabei de pensar em um número entre 0 e 10\nSerá que você consegue advinhar qual foi?", end='\n\n')

while (pc not in player):
    
    for i in range(11):
        
        if (i in player):
            print(colored(i,'yellow'), end=' ')
            
        else:
            print(colored(i,'red'), end=' ')
            
    n = int(input("\n\nQual o seu palpite? "))
    
    if (n in player):
        print("Você já digitou esse número antes.\n")
    
    elif (pc not in player):
        player += [n]
        cont += 1
        
        print("Hmmm... Tente mais uma vez\n")
            
for i in range(11):
    
    if i == pc:
        print(colored(i,'green'), end=' ')
    
    elif i in player:
        print(colored(i,'yellow'), end=' ')
    
    else:
        print(colored(i,'red'), end=' ')
        
if cont == 1:
    print("\n\nApcu de primeira. Parabéns!")

else:
    print("\n\nApcu com {} tentativas.\n".format(cont))