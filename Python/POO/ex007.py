class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def falar(self):
        print("Falando...")


class Cliente(Pessoa):
    def comprar(self):
        print("Comprando...")


class Aluno(Pessoa):
    def estudar(self):
        print("Estudando...")


c1 = Cliente("Gabriel", 20)
c1.falar()
c1.comprar()

p1 = Pessoa("José", 35)
p1.falar()

a1 = Aluno("Rafael", 14)
a1.estudar()
