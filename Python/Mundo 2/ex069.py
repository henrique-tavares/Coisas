maior_18 = homem = m_menor_20 = 0

while True:
    
    print("")
    print('-' * 30)
    print(f"{'CADASTRE UMA PESSOA':^30}")
    print('-' * 30)
    
    idade = int(input("Idade: "))
    
    if (idade < 0):
        print("\n[ERRO] Idade inválida")
        continue
    
    sexo = input("Sexo [M/F]: ").strip().upper()
    
    if (sexo not in ['M','F']) :
        print("\n[ERRO] Sexo inválido")
        continue
    
    if idade > 18:
        maior_18 += 1
    
    if sexo == 'M':
        homem += 1
    
    if (sexo == 'F') and (idade < 20):
        m_menor_20 += 1
        
    while True:
    
        op = input("\nQuer continuar? [S/N]: ").strip().upper()
        
        if op in ['S','N']: break

    if op == 'N': break
    
print(f'\nTotal de pessoas com mais de 18 anos: {maior_18}')
print(f'Ao todo temos {homem} homens cadastrados')
print(f'E temos {m_menor_20} mulheres com menos de 20 anos\n')   