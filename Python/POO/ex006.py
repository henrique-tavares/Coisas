class Cliente:
    
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self._endereco = []
    
    @property
    def idade(self):
        return self._idade
    
    @idade.setter
    def idade(self, idade):
        
        if idade >= 0:
            self._idade = idade
        else:
            raise ValueError('A idade não pode ser negativa')
    
    @property
    def endereco(self):
        return self._endereco
    
    def insereEndereco(self, cidade, estado):
        self.endereco.append(Endereco(cidade, estado))
        
    
    def listaEnderecos(self):
        for endereco in self.endereco:
            print(endereco.cidade, endereco.estado)
    
    def deletaEndereco(self, cidade, estado):
        for i, endereco in enumerate(self.endereco):
            if cidade == endereco.cidade and estado == endereco.estado:
                self.endereco.pop(i)


class Endereco:
    
    def __init__(self, cidade, estado):
        self._cidade = cidade
        self._estado = estado
    
    @property
    def cidade(self):
        return self._cidade

    @property
    def estado(self):
        return self._estado


c1 = Cliente('Luiz', 29)
c1.insereEndereco('Belo Horizonte', 'MG')
c1.listaEnderecos()
c1.deletaEndereco('Belo Horizonte', 'MG')
c1.insereEndereco('Fortaleza', 'SC')
c1.listaEnderecos()