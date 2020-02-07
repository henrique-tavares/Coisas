print("=-=" * 8)
print(" Sequencia de Fibonacci")
print("=-=" * 8, end='\n\n')

n = int(input("Quantos termos você quer mostrar? "))

fib_0 = 0
fib_1 = 1

print("")
for i in range(n):
    
    if i == 0:
        fib = fib_0
        
    elif i == 1:
        fib = fib_1
    
    else:
        fib = fib_0 + fib_1
        
        fib_0 = fib_1
        fib_1 = fib
    
    print("{} ->".format(fib), end=' ')

print("FIM", end='\n\n')