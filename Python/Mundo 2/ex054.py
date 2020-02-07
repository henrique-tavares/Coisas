from time import localtime

ano = localtime()[0]

maior = 0
menor = 0

print("")
for i in range(7):
    ano_nasc = int(input("Em que ano a {}ª pessoa nasceu? ".format(i+1)))
    
    if ((ano - ano_nasc) < 21): menor += 1
    else: maior += 1

print("\nAo todo temos {} pessoas maiores de idade\nE também {} pessoas menores de idade".format(maior, menor),end='\n\n')