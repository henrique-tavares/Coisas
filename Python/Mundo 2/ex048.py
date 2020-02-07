print("")

total = 0
cont = 0

for i in range(1, 500, 2):
    
    if (i % 3 == 0):
        total += i
        cont += 1

print("A soma dos primeiros {} números impares múltiplos de 3 é igual a {}".format(cont, total), end="\n\n")