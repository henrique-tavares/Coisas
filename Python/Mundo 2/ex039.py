from time import localtime

ano_nasc = int(input("\nAno de nascimento: "))

ano = localtime()[0]

idade = ano - ano_nasc

print("\nQuem nasceu em {} tem {} anos em {}".format(ano_nasc, idade, ano), end="\n\n")

if (idade < 18):
    print("Ainda faltam {} para o alistamento".format(18 - idade))
    print("Seu alistamento será em {}".format(ano + (18 - idade)))

elif (idade > 18):
    print("Você deveria ter se alistado há {}".format(idade - 18))
    print("Seu alistamento foi em {}".format(ano - (idade - 18)))
    
else: print("Você tem que se alistar esse ano!")

print("")