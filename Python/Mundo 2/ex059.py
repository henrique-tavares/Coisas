from time import sleep

n1 = int(input("\nPrimeiro número: "))
n2 = int(input("Segundo número: "))
print("")

op = 0

while op != 5:
    
    print("\t[ 1 ] Soma")
    print("\t[ 2 ] Multiplicação")
    print("\t[ 3 ] Maior")
    print("\t[ 4 ] Novos números")
    print("\t[ 5 ] Sair do programa")
    
    op = int(input(">>>>> Qual sua opção: "))
    
    if (op == 1):
        print("\nO resultado {} + {} é {}".format(n1, n2, n1 + n2))
    
    elif (op == 2):
        print("\nO resultado {} * {} é {}".format(n1, n2, n1 * n2))
    
    elif (op == 3):
        print("\nEntre {} e {} o maior valor é {}".format(n1, n2, max([n1, n2])))
    
    elif (op == 4):
        n1 = int(input("\nPrimeiro número: "))
        n2 = int(input("Segundo número: "))
    
    elif (op == 5):
        print("\nFinalizando...")
    
    else:
        print("\nOpção inválida. Tente novamente")
    
    print('=-=' * 15, end='\n\n')
    
sleep(2)