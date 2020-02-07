sexo = input("Informe o seu sexo [M/F]: ").capitalize().strip()

while (sexo not in ['M', 'F', 'Masculino', 'Feminino']):
    sexo = input("\nDados inválidos. Por favor, informe seu sexo [M/F]: ").upper().strip()

print("\nSexo {} registrado com sucesso.".format(sexo), end='\n\n')