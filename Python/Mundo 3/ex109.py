from modulos import moeda as m

numero = float(input("\nDigite o preço: R$"))
p = 10

print(f'\nA metade de {m.brl(numero)} é {(m.metade(numero, fmt=True))}')
print(f'O dobro de {m.brl(numero)} é {(m.dobro(numero, fmt=True))}')
print(f'Aumentando {p}%, temos {(m.aumentar(numero, p, fmt=True))}')
print(f'Diminuindo {p}%, temos {(m.diminuir(numero, p, fmt=True))}\n')