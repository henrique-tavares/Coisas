print("")

soma = 0
for i in range(6):
    n = float(input("Digite o {}° número: ".format(i+1)))
    
    if (n % 2 == 0):
        soma += n

print("\nA soma dos valores pares é igual a {}".format(soma), end="\n\n")