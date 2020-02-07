from random import randint
from operator import itemgetter

jogadores = dict()
ranking = list()

print("\nValores sorteados:\n")

for i in range(1,5):
    
    jogadores['jogador' + str(i)] = randint(0,6)
    print(f'{"jogador" + str(i)} tirou {jogadores["jogador" + str(i)]}')

print('', '-=' * 20, '', sep='\n')

ranking = sorted(jogadores.items(), key=itemgetter(1), reverse=True)

print('  == RANKING DOS JOGADORES ==')

for i, jogador in enumerate(ranking):
    print(f'   {i+1}º lugar: {jogador[0]} com {jogador[1]}')
    
print()
