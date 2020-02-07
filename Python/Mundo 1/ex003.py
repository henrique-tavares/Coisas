n1 = float(input("Digite um número: "))
n2 = float(input("Digite outro: "))

if (n1.is_integer()): n1 = int(n1)
if (n2.is_integer()): n2 = int(n2)

print("A soma entre {} e {} é {}!".format(n1, n2, n1 + n2))
