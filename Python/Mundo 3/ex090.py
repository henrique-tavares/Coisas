aluno = {'nome': str, 'media': float, 'situacao': str}

aluno['nome'] = input("\nNome: ")
aluno['media'] = float(input(f'Média de {aluno["nome"]}: '))

if aluno['media'] >= 7:
    aluno['situacao'] = 'Aprovado'

elif aluno['media'] >= 5:
    aluno['situacao'] = 'Recuperação'

else:
    aluno['situacao'] = 'Reprovado'

print('', '-=' * 25)

for k, v in aluno.items():
    print(f'  - {k} é igual a {v}')

print()