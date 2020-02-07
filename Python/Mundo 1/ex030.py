from termcolor import colored

num = int(input(colored("\nMe diga um número qualquer: ", 'magenta')))

print("\nO número {} é".format(num), end=" ")

if (num % 2 == 0):
    print(colored("PAR!", 'cyan'), end="\n\n")

else:
    print(colored("IMPAR!", 'cyan'), end="\n\n")