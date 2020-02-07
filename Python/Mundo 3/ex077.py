palavras = ('aprender', 'programar', 'linguagem', 'python', 'curso', 'gratis', 'estudar', 'praticar', 'trabalhar', 'mercado', 'programador', 'futuro')
vogais = ('a', 'e', 'i', 'o', 'u')

for palavra in palavras:
    
    print(f'\nNa palavra {palavra.upper()} temos ', end='')
    
    for letra in palavra.lower():
        
        if letra in vogais: print(letra, end=' ')
    
print("\n")