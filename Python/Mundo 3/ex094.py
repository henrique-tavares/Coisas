pessoas = list()
dados = dict()
media = 0

while True:
    
    dados['nome'] = input("\nNome: ").strip()
    
    while True:
        
        dados['sexo'] = input("Sexo: [M/F] ").strip().upper()
        
        if dados['sexo'] in ['M','F']: break
    
    dados['idade'] = int(input("Idade: "))
    media += dados['idade']
    
    pessoas.append(dados.copy())
    
    while True:
        
        op = input("\nQuer continuar: [S/N] ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

media /= len(pessoas)
    
print('', '-=' * 30, '', sep='\n')

print(f'A) Ao todo temos {len(pessoas)} pessoas cadastradas.')
print(f'B) A média de idade é de {media} anos.')
print(f'C) As mulheres cadastradas foram ', end='')

for pessoa in pessoas:
    
    if pessoa['sexo'] == 'F':
        print(f'[{pessoa["nome"]}]', end=' ')
    
print(f'\nD) Lista das pessoas que estão acima da média:')

for pessoa in pessoas:
    
    if pessoa['idade'] >= media:
        print(f'\t nome = {pessoa["nome"]}; sexo = {pessoa["sexo"]}; idade = {pessoa["idade"]};')
    
print()