def voto(nascimento):
    
    from time import localtime
    
    ano = localtime()[0]
    
    global idade
    idade = ano - nascimento
    
    if idade < 16:
        return f'Com {idade}: VOTO NEGADO'
    
    elif idade < 18 or idade > 65:
        return f'Com {idade}: VOTO OPCIONAL'
    
    else:
        return f'Com {idade}: VOTO OBRIGATÓRIO'
    

print(voto(int(input("\nEm que ano você nasceu? "))), end='\n\n')
