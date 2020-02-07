compras = float(input("\nQual o preço das compras? R$"))

print('''
FORMAS DE PAGAMENTO:
[ 1 ] à vista dinheiro/cheque
[ 2 ] à vista no cartão
[ 3 ] 2x no cartão
[ 4 ] 3x ou mais no cartão''')

op = int(input("\nQual a sua opção? "))

if (op == 1):
    print("Sua compra de R${:.2f} vai custar R${:.2f} no final".format(compras, compras - (compras * 10/100)))

elif (op == 2):
    print("Sua compra de R${:.2f} vai custar R${:.2f} no final".format(compras, compras - (compras * 5/100)))

elif (op == 3):
    print("\nSua compra será parcelada em {}x de R${:.2f} SEM JUROS".format(2, compras / 2))
    print("Sua compra de R${:.2f} vai custar R${:.2f} no final".format(compras, compras))

elif (op == 4):
    parcelas = int(input("Quantas parcelas? "))
    print("\nSua compra será parcelada em {}x de R${:.2f} COM JUROS".format(parcelas, (compras + (compras * 20/100)) / parcelas))
    print("Sua compra de R${:.2f} vai custar R${:.2f} no final".format(compras, compras + (compras * 20/100)))

else:
    print("Opção inválida. Tente novamente")

print("")