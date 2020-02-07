res = 'S'
cont = 0
media = 0

while res == 'S':
    
    num = float(input("\nDigite um número: "))
    res = input("Quer continuar [S/N]: ").strip().upper()
    
    if (num.is_integer()): num = int(num)
    
    media += num
    cont += 1
    
    if (cont == 1):
        maior = num
        menor = num
    
    elif (num > maior): maior = num
    
    elif (num < menor): menor = num
    
media /= cont

print("\nVocê digitou {} números e a média foi {}\nO menor valor foi {} e o maior foi {}\n".format(cont, media, menor, maior))