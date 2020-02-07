cont = soma = 0

print("")
while True:
    
    n = float(input("Digite um valor [999 para parar]: "))
    
    if (n.is_integer()): n = int(n)
    
    if n == 999: break
    
    soma += n
    cont += 1

print(f"\nA soma dos {cont} valores foi {soma}!\n")