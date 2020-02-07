from time import localtime

ano = localtime()[0]

ano_nasc = int(input("\nAno de nscimento: "))

idade = ano - ano_nasc

print("\nO atleta tem {} anos".format(idade))
print("Classificação: ", end='')

if (idade <= 9):
    print("MIRIM")
    
elif (idade <= 14):
    print("INFANTIL")

elif (idade <= 19):
    print("JÚNIOR")

elif (idade <= 25):
    print("SÊNIOR")
    
else:
    print("MASTER")

print("")