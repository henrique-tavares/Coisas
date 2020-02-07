n1 = float(input("Primeiro valor: "))
if (n1.is_integer()): n1 = int(n1)

maior = n1
menor = n1

n2 = float(input("Segundo valor: "))
if (n2.is_integer()): n2 = int(n2)

if (n2 > maior): maior = n2
elif (n2 < menor): menor = n2

n3 = float(input("Terceiro valor: "))
if (n3.is_integer()): n3 = int(n3)

if (n3 > maior): maior = n3
elif (n3 < menor): menor = n3

print("O menor valor digitado foi {}".format(menor))
print("O maior valor digitado foi {}".format(maior))