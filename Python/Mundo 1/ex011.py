largura = float(input("Largura da parede em metros: "))
altura = float(input("Altura da parede em metros: "))

print("\nSua parede tem a dimensão de {}m x {}m e sua área é de {}m².".format(largura, altura, largura * altura))
print("Para pintar essa parede, você precisará de {}l de tinta.".format((largura * altura)/2))