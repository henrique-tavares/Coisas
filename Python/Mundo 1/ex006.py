n = float(input("Digite um número: "))

if (n.is_integer()): n = int(n)

print("O dobro de {} vale {}.\nO triplo de {} vale {}.\nA raiz quadrada de {} é igual a {}".format(n, n*2, n, n*3, n, n**.5))