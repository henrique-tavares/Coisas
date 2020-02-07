from time import localtime

trabalhador = dict()
ano = localtime()[0]

trabalhador['nome'] = input("\nNome: ")
trabalhador['idade'] = ano - int(input("Ano de nascimento: "))
trabalhador['ctps'] = int(input("Carteira de trabalho (0 não tem): "))

if trabalhador['ctps'] != 0:
    trabalhador['contratação'] = int(input("Ano de contratção: "))
    trabalhador['salário'] = float(input("Salário: R$"))
    trabalhador['aposentadoria'] = 35 - (ano - trabalhador['contratação']) + trabalhador['idade']

print('', '-=' * 30, '', sep='\n')

for k, v in trabalhador.items():
    print(f'  - {k} tem valor {v}')

print()