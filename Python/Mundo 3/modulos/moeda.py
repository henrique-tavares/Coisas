def aumentar(n, p, fmt=False):

    if fmt: return brl(n + (n * p/100))

    else: return n + (n * p/100)

def diminuir(n, p, fmt=False):

    if fmt: return brl(n - (n * p/100))

    else: return n - (n * p/100)

def dobro(n, fmt=False):

    if fmt: return brl(n * 2)

    else: return n * 2

def metade(n, fmt=False):

    if fmt: return brl(n / 2)

    else: return n / 2

def resumo(n, aum=0, red=0):
    
    res = '-' * 30
    res += f'\n{"RESUMO DO VALOR":^30}\n'
    res += '-' * 30
    res += f'\n{"Preço analisado:":<20}{brl(n):<10}'
    res += f'\n{"Dobro do preço:":<20}{dobro(n, fmt=True):<10}'
    res += f'\n{"Metade do preço:":<20}{metade(n, fmt=True):<10}'
    res += f'\n{f"{aum}% de aumento:":<20}{aumentar(n, aum, fmt=True):<10}'
    res += f'\n{f"{red}% de redução:":<20}{diminuir(n, red, fmt=True):<10}\n'
    res += '-' * 30
    
    print(res)

def brl(n):
    return f'R${n:.2f}'.replace('.',',')