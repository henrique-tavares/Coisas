def ficha(nome = '', gols = ''):
    
    if gols.isnumeric(): gols = int(gols)
    
    else:
        gols = 0
    
    if nome == '': nome = '<desconhecido>'
        
    return f'O jogador {nome} fez {gols} gol(s) no campeonato.'

nome = input("\nNome do jogador: ").strip()
gols = input("Número de gols: ").strip()

print()
print(ficha(nome, gols))
print()