print('=-=' * 7)
print("Gerador de PA")
print('=-=' * 7)

termo = float(input("\nPrimeiro termo: "))
razao = float(input("Razão da PA: "))

if (termo.is_integer() and razao.is_integer()):
    termo = int(termo)
    razao = int(razao)

qtd = 10
cont = qtd

while (qtd != 0):
    
    print("")
    for i in range(qtd):
        
        if (i != (qtd - 1)):
            print("{} ->".format(termo), end=' ')
        
        else:
            print("{} Pausa!".format(termo), end='\n\n')
        
        termo += razao
    
    qtd = int(input("Quantos termos você quer mostar a mais? "))
    
    cont += qtd
    
print("\nPA finalizada com {} termos mostrados\n".format(cont))