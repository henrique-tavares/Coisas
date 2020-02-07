numeros = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'catorze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')

while True:
    
    n = int(input("\nDigite um número entre 0 e 20: "))
    
    if 0 <= n <= 20: break 
    
    print("\n[ERRO] Valor fora do intervalo")

print(f'\nVocê digitou o número {numeros[n]}\n')