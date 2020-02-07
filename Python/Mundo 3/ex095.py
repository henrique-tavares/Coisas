jogador = {'nome': str, 'gols': [], 'total': int}
time = list()

while True:
    
    jogador['nome'] = input("\nNome do jogador: ").strip()
    n = int(input(f'Quantas partidas {jogador["nome"]} jogou? '))
    
    for i in range(n):
        jogador['gols'].append(int(input(f'\tQuantos gols na {i+1}ª partida? ')))
    
    jogador['total'] = sum(jogador['gols'])
    
    time.append(jogador.copy())
    time[-1]['gols'] = jogador['gols'][:]
    jogador['gols'].clear()
    
    while True:
        
        op = input("\nQuer continuar: [S/N] ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

print('', '-=' * 30, '', sep='\n')

print(f'{"cod":<3} {"nome":<15} {"total":<5} {"gols":<10}')
print('-' * 40)    

for i, j in enumerate(time):
    print(f'{i:>3} {j["nome"]:<15} {j["total"]:<5} {j["gols"]}')

print()

while True:
    
    print('-' * 40)    
    op = int(input("Mostrar dados de qual jogador: (-1 para parar) "))
    
    if op == -1: break
    
    if op not in range(len(time)):
        print("\n[ERRO] Valor fora do intervalo\n")
        continue
    
    print(f'\n -- LEVANTAMENTO DO JOGADOR {time[op]["nome"]}: ')
    
    for i, n in enumerate(time[op]['gols']):
        print(f'\tNo jogo {i+1} fez {n} gols.')
    
    print()
print()