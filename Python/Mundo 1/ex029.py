from termcolor import colored

vel = float(input("Qual é a velocidade atual do carro em km/h? "))

if (vel > 80):
    print(colored("\nMULTADO! Você excedeu o limite permitido de 80km/h", 'red'))
    print(colored("Você deve pagar uma multa de", 'red'), end=' ')
    print(colored("R${:.2f}".format((vel - 80)*7), 'yellow'))

print(colored("\nTenha um bom dia! Dirija com segurança!", 'green'), end="\n\n")