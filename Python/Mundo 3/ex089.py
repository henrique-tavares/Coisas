alunos = list()

while True:
    
    alunos.append([input("\nNome: "), [float(input("Nota 1: ")), float(input("Nota 2: "))], 0])
    alunos[-1][2] = sum(alunos[-1][1]) / 2 
    
    while True:
        
        op = input("\nQuer continuar? [S/N] ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break
    
print()
print('-=' * 30)

print(f'{"No.":3} {"NOME":<20} {"MÉDIA":<5}')
print('-' * 30)

for i, aluno in enumerate(alunos):
    
    print(f'{i:<3} {aluno[0]:<20} {aluno[2]:>5.1f}')

print()

while True:
    
    print('-' * 50)
    n = int(input("Mostrar notas de qual aluno (-1 interrompe): "))
    
    if n == -1: break
    
    if n >= len(alunos):
        print('\n[ERRO] Valor fora do intervalo. Tente novamente...\n')
        continue
    
    print(f'\nNotas de {alunos[n][0]} são: {alunos[n][1]}\n')

print()