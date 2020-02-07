n = float(input("Digite um número: "))

if (n.is_integer()): n = int(n)

print("Analisando o valor {}, seu antecessor é {} e o sucessor é {}".format(n, n - 1, n + 1))