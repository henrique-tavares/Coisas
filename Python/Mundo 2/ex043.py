peso = float(input("\nQual o seu peso em Kg? "))
altura = float(input("qual a sua altura em metros? "))

imc = peso / (altura**2)

print("O seu IMC é de {:.1f}\nCategoria: ".format(imc), end='')

if (imc < 18.5):
    print("ABAIXO DO PESO")

elif (imc < 25):
    print("PESO IDEAL")

elif (imc < 30):
    print("SOBREPESO")

elif (imc < 40):
    print("OBESIDADE")

else:
    print("OBESIDADE MORBIDA")
    
print("")    