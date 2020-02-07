salario = float(input("\nQual o salário do funcionário? R$"))

if (salario > 1250): novo = salario + (salario * 10/100)

else: novo = salario + (salario * 15/100)

print("\nQuem ganhava R${:.2f} passa a ganhar R${:.2f}".format(salario, novo), end="\n\n")