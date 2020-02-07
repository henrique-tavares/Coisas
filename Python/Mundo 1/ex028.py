from time import sleep
from random import randint
from termcolor import colored

print(colored('=-=' * 20, 'yellow'))
print(colored("   Vou pensar em um número entre 0 e 5. Tente advinhar...", 'cyan'))
print(colored('=-=' * 20, 'yellow'), end="\n\n")

num = int(input("Em que número pensei? "))

print(colored("\nPROCESSANDO...", 'magenta'), end="\n\n")
sleep(1)

rand = randint(0,5)

if (num == rand): print(colored("PARABÉNS! Você conseguiu me vencer!", 'green'), end="\n\n")
else: print(colored("GANHEI! Eu pensei no número {} e não no {}".format(rand, num), 'red'), end="\n\n")