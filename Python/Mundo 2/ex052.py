from termcolor import colored

num = int(input("\nDigite um número: "))

div = 0

print("")
for i in range (1, num + 1):
    if (num % i == 0):
        div += 1
        print(colored("{}".format(i), 'yellow'), end=' ')
    
    else:
        print(colored("{}".format(i), 'red'), end=' ')

print("\n\nO número {} foi divisível {} vezes.\nE por isso ele".format(num, div),end=' ')

if (div > 2): print("NÃO É PRIMO")
else: print("É PRIMO")        
print("")