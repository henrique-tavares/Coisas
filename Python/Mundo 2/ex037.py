num = int(input("\nDigite um número inteiro: "))

print("\nEscolha uma das bases para conversão: ")
print("[ 1 ] converter para BINÁRIO")
print("[ 2 ] converter para OCTAL")
print("[ 3 ] converter para HEXADECIMAL")

op = int(input("Sua opção: "))

if (op == 1): print("\n{} convertido para BINÁRIO é igual a {}".format(num, bin(num)[2:]))

elif (op == 2): print("\n{} convertido para OCTAL é igual a {}".format(num, oct(num)[2:]))

elif (op == 3): print("\n{} convertido para HEXADECIMAL é igual a {}".format(num, hex(num)[2:]))

else: print("Opcção inválida. Tente novamente")

print("")