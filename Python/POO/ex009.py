from abc import ABCMeta, abstractmethod

class Animal(metaclass=ABCMeta):
    
    __slots__ = ()
            
    @property
    @abstractmethod
    def nome(self): pass
    
    @property
    @abstractmethod
    def peso(self): pass
    
    @property
    @abstractmethod
    def idade(self): pass
    
    @abstractmethod
    def comer(self): pass
    
    @abstractmethod
    def locomover(self): pass
    

class Pessoa(Animal):
    
    __slots__ = ('_nome', '_peso', '_idade')
    
    def __init__(self, nome, peso, idade):
        self.nome = nome
        self.peso = peso
        self.idade = idade
    
    @property
    def nome(self):
        return self._nome
    
    @nome.setter
    def nome(self, nome):
        self._nome = nome
    
    @property
    def peso(self):
        return self._peso
    
    @peso.setter
    def peso(self, peso):
        self._peso = peso
    
    @property
    def idade(self):
        return self._idade
    
    @idade.setter
    def idade(self, idade):
        self._idade = idade
        
    def comer(self, comida):
        print(f'{self.nome} está comendo {comida}')
    
    def locomover(self):
        print(f'{self.nome} está andando sobre duas pernas')


class Gato(Animal):
    
    __slots__ = ('_nome', '_peso', '_idade')
        
    def __init__(self, nome, peso, idade):
        self.nome = nome
        self.peso = peso
        self.idade = idade
    
    @property
    def nome(self):
        return self._nome
    
    @nome.setter
    def nome(self, nome):
        self._nome = nome
    
    @property
    def peso(self):
        return self._peso
    
    @peso.setter
    def peso(self, peso):
        self._peso = peso
    
    @property
    def idade(self):
        return self._idade
    
    @idade.setter
    def idade(self, idade):
        self._idade = idade
    
    def comer(self):
        print(f'{self.nome} está comendo sua ração')
    
    def locomover(self):
        print(f'{self.nome} está andando sobre quatro patas')
