print("=-=" * 10)
print("   Analisador de triângulos")
print("=-=" * 10)

a = float(input("Primeiro segmento: "))
b = float(input("Segundo segmento: "))
c = float(input("Terceiro segmento: "))

if ((b + c > a > abs(b - c)) or (a + c > b > abs(a - c)) or (b + a > c > abs(b - a))):
    
    if (a == b == c):
        print("Os segmentos acima podem formar um triângulo EQUILÁTERO!")
    
    elif (a == b or a == c or b == c):
        print("Os segmentos acima podem formar um triângulo ISÓSCELES!")
    
    else:
        print("Os segmentos acima podem formar um triângulo ESCALENO!")
    
else:
    print("Os segmentos acima não podem formar um triângulo!")