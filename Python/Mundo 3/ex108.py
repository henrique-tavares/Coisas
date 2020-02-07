from modulos import moeda as m

numero = float(input("\nDigite o preço: R$"))
p = 10

print(f'\nA metade de {m.brl(numero)} é {m.brl(m.metade(numero))}')
print(f'O dobro de {m.brl(numero)} é {m.brl(m.dobro(numero))}')
print(f'Aumentando {p}%, temos {m.brl(m.aumentar(numero, p))}')
print(f'Diminuindo {p}%, temos {m.brl(m.diminuir(numero, p))}\n')