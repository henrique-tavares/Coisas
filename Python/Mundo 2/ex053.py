frase = input("Digite uma frase: ").strip().replace(' ','').lower()

frase_inv = ''

for i in frase:
    frase_inv = i + frase_inv

print("\nO inverso de {} é {}".format(frase, frase_inv))

if (frase == frase_inv):
    print("A frase digitada é um palíndromo")

else:
    print("A frase digitada não é um palíndromo")

print("")