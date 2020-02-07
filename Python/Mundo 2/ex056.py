print("")

media = 0
m_menor = 0
h_maior = 0
for i in range(4):
    print("------- {}ª Pessoa -------".format(i+1))
    nome = input("Nome: ")
    idade = int(input("Idade: "))
    sexo = input("Sexo [M/F]: ")
    
    media += idade
    
    if (sexo == 'F' and idade < 20): m_menor += 1
    
    if (sexo == 'M'):
        
        if (i == 0): 
            h_maior = idade

        elif (idade > h_maior):
            h_maior = idade
            h_nome = nome

media /= 4
        
print("\nA média de idade do grupo é de {} anos".format(media))
print("O homem mais velho tem {} anos e se chama {}".format(h_maior, h_nome))
print("Ao todo são {} mulheres com menos de 20 anos".format(m_menor), end='\n\n')        