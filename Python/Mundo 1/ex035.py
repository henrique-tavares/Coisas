print("=-=" * 10)
print("   Analisador de triângulos")
print("=-=" * 10)

a = float(input("Primeiro segmento: "))
b = float(input("Segundo segmento: "))
c = float(input("Terceiro segmento: "))

if ((b + c > a > abs(b - c)) or (a + c > b > abs(a - c)) or (b + a > c > abs(b - a))):
    print("Os segmentos acima podem formar um triângulo!")
    
else: print("Os segmentos acima não podem formar um triângulo!")