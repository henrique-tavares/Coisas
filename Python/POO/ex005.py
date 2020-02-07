class Escritor:

    def __init__(self, nome):
        self._nome = nome
        
    
    @property
    def nome(self):
        return self._nome
    
    
    @property
    def ferramenta(self):
        return self._ferramenta
    
    
    @ferramenta.setter
    def ferramenta(self, ferramenta):
        self._ferramenta = ferramenta


class Caneta:
    
    def __init__(self, cor):
        self.cor = cor
        
    
    def escrever(self):
        print('Caneta está escrevendo...')
        
    
class MaquinaDeEscrever:
    
    def escrever(self):
        print('Máquia está escrevendo...')
        

escritor = Escritor('José')
escritor.ferramenta = Caneta('preta')

escritor.ferramenta.escrever()