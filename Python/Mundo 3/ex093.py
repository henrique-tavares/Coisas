jogador = {'nome': str, 'gols': [], 'total': int}

jogador['nome'] = input("\nNome do jogador: ")
n = int(input(f'Quantas partidas {jogador["nome"]} jogou? '))

for i in range(n):    
    jogador['gols'].append(int(input(f'\tQuantos gols na {i+1}ª partida? ')))

print()

jogador['total'] = sum(jogador['gols'])

print('', '-=' * 30, '', sep='\n')

print(jogador)

print('', '-=' * 30, '', sep='\n')

for k, v in jogador.items():
    print(f'O campo {k} tem o valor {v}')

print('', '-=' * 30, '', sep='\n')

print(f'O jogador {jogador["nome"]} jogou {n} partidas')

for i in range(n):
    print(f'\t=> Na partida {i+1}, fez {jogador["gols"][i]}')

print(f'\nFoi um total de {jogador["total"]} gols\n')