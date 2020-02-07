num = 0
soma = 0
cont = 0

print("")
while num != 999:

    num = float(input("Digite um número [999 para parar]: "))
    
    if (num.is_integer()): num = int(num)
    
    
    if (num != 999):
        soma += num
        cont += 1

print("\nVocê digitou {} números e a soma entre eles foi {}\n".format(cont, soma))