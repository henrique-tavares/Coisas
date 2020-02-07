while True:
    
    num = float(input("\nQuer ver a tabuada de qual valor [0 para parar]: "))
    
    if num == 0: break
    
    if num.is_integer(): num = int(num)
    
    print('-' * 30)
    
    for i in range(1,11): print(f"{num} x {i:2} = {num * i}")

    print('-' * 30)
    
print("\nPROGRAMA TABUADA ENCERRADO.", end="\n\n")