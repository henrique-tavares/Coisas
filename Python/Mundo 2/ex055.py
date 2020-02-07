print("")

for i in range(5):
    peso = float(input("Peso da {}ª Pessoa em Kg: ".format(i+1)))
    
    if (i == 0):
        maior = peso
        menor = peso
    
    elif (peso > maior): maior = peso
    
    elif (peso < menor): menor = peso

print("O menor peso lido foi {:.2f}Kg".format(menor))
print("O maior peso lido foi {:.2f}Kg".format(maior), end='\n\n')