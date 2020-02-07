num = int(input("Digite um número entre 0 e 9999: "))

s_num = "{:0>4}".format(num)

print("Unidade: {}\nDezena: {}\nCentena: {}\nMilhar: {}".format(s_num[3], s_num[2], s_num[1], s_num[0]))