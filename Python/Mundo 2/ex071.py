nota_1 = nota_10 = nota_20 = nota_50 = 0

print('=' * 30)
print(f'{"BANCO CEV":^30}')
print('=' * 30)

while True:
    
    saque = int(input("\nQual o valor que deseja sacar: R$"))

    if saque > 0: break
    
    print("\n[ERRO] Valor inválido")
    
print("")
for nota in [100, 50, 20, 10, 5, 1]:
    
    qtd = saque // nota
    saque %= nota
    
    if qtd > 0:
        print(f'Total de {qtd} cédula(s) de R${nota}')

print('=' * 30)
