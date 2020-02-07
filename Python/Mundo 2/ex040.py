n1 = float(input("\nPrimeira nota: "))
n2 = float(input("Segunda nota: "))

media = (n1 + n2) / 2

print("\nTirando {:.2f} e {:.2f}, a média do aluno é {:.2f}".format(n1, n2, media))

if (media >= 7):
    print("O aluno está APROVADO!")

elif (media >= 5):
    print("O aluno está em RECUPERAÇÃO!")

else: print("O aluno está REPROVADO!")

print("")