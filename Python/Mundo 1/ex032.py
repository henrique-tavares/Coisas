from time import localtime

ano = int(input("\nQue ano quer analisar? Digite '0' para analisar o ano atual: "))

if (ano == 0): ano = localtime()[0]

if ((ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0): print("O ano {} é bissexto".format(ano), end="\n\n")

else: print("O ano {} não é bissexto".format(ano), end="\n\n")

