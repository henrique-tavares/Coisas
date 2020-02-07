def área(largura, altura):
    print(f'\nA área de um terreno {largura}m x {altura}m é de {largura * altura}m².\n')


print(f'\n{"Controle de Terrenos":^25}', '-' * 25, sep='\n')
área(float(input("LARGURA (m): ")), float(input("ALTURA (m): ")))