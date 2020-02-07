def escreva(txt: str):
    n = len(txt)
    print('', '~' * (n+4), f'{txt:^{n+4}}', '~' * (n+4), sep='\n')


while True:
    
    escreva(input("\nDigite uma frase: ").strip())
    
    while True:
        
        op = input("\nQuer continuar? [S/N] ").strip().upper()
        
        if op in ['S','N']: break
    
    if op == 'N': break

print()