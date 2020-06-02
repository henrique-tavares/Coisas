class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def desconto(self, percentual):
        self.preco = self.preco - (self.preco * percentual / 100)

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, value):
        self._nome = value.title()

    @property
    def preco(self):
        return self._preco

    @preco.setter
    def preco(self, value):

        if isinstance(value, str):
            try:
                value = float(
                    value.replace("R$", "").replace(" ", "").replace(",", ".")
                )
            except:
                value = -1

        self._preco = value


p1 = Produto("cAMISA", 40)
p1.desconto(15)
print(p1.nome, p1.preco)

p2 = Produto("Caneca", "R$17,50")
print(p2.nome, p2.preco)
