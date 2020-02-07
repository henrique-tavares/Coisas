num = -1

while num < 0:
    num = int(input("Digite um número para\ncalcular seu fatorial: "))
    
    if (num < 0):
        print("[ERRO] Não é possível calcular o fatorial de num número negativo")

if (num == 0):
    print("\nCalculando {}! = 1".format(num), end='')
    
else:
    print("\nCalculando {}! = ".format(num), end='')

fat = 1
for i in range(num,0,-1):
    
    fat *= i
    
    if (i == 1):
        print("{} = {}".format(i, fat), end='\n\n')
    
    else:
        print("{} x".format(i), end=' ')
        