dias = int(input("Quantos dias alugados? "))
km = float(input("Quantos Km rodados? "))

print("\nO total a pagar é de R${:.2f}".format((dias*60) + (km*0.15)))