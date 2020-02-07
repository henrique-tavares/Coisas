print('-' * 50)
print(f'{"LOJAS SUPER BARATÃO":^50}')
print('-' * 50)

totCompra = totCaro = precoMenor = 0
prodMenor = ''

while True:
    
    produto = input("\nNome do produto: ")
    preco = float(input("Preço: R$"))
    
    if preco <= 0:
        print("\n[ERRO] Preço inválido")
        continue
    
    totCompra += preco
    
    if preco > 1000: totCaro += 1
    
    if (totCompra == preco) or (preco < precoMenor):
        prodMenor = produto
        precoMenor = preco
        
    
    while True:
        
        op = input("\nQuer continuar [S/N]: ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

print("")
print('-' * 50)
print(f'{"FIM DO PROGRAMA":^50}')
print('-' * 50)

print(f'O total da compra foi R${totCompra:.2f}')
print(f'Temos {totCaro} produtos custando mais de R$1000')
print(f'O produto mais barato foi {prodMenor.lower()} que custa R${precoMenor:.2f}\n')