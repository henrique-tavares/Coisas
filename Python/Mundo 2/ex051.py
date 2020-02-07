termo = float(input("\nPrimeiro termo: "))
razao = float(input("Razão: "))

if (termo.is_integer() and razao.is_integer()):
    termo = int(termo)
    razao = int(razao)

print("")
for i in range(10):
    
    if (i != 9):
        print("{} -> ".format(termo), end='')
    
    else:
        print("{}!".format(termo), end="\n\n")
    
    termo += razao