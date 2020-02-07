expressao = input("\nDigite a expressão: ").strip()
pilha = []

for i in expressao:
    
    if i == '(':
        pilha.append(i)
    
    elif i == ')':
        
        if len(pilha) > 0:
            pilha.pop()
        
        else:
            pilha.append(i)
        
if len(pilha) == 0:
    print("Sua expressão está válida!\n")

else:
    print("Sua expressão está errada!\n")