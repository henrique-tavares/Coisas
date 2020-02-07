print('=-=' * 7)
print("Gerador de PA")
print('=-=' * 7)

termo = float(input("\nPrimeiro termo: "))
razao = float(input("Razão da PA: "))

if (termo.is_integer() and razao.is_integer()):
    termo = int(termo)
    razao = int(razao)

print("")
i = 0
while i < 10:
    
    if (i != 9):
        print("{} ->".format(termo), end=' ')
    
    else:
        print("{} FIM!".format(termo), end='\n\n')
    
    termo += razao
    i += 1
    