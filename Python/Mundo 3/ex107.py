from modulos import moeda as m

numero = float(input("\nDigite o preço: R$"))
p = 10

print(f'\nA metade de R${numero:.2f} é R${m.metade(numero):.2f}')
print(f'O dobro de R${numero:.2f} é R${m.dobro(numero):.2f}')
print(f'Aumentando {p}%, temos R${m.aumentar(numero, p):.2f}')
print(f'Diminuindo {p}%, temos R${m.diminuir(numero, p):.2f}\n')