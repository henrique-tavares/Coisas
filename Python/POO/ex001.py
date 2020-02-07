from time import localtime
from random import randint

class Pessoa:
    
    anoAtual = localtime()[0]
    
    def __init__(self, nome, idade, comendo=False, falando=False):
        self.nome = nome
        self.idade = idade
        self.comendo = comendo
        self.falando = falando
    
    
    def comer(self, alimento):
        
        if self.comendo:
            print(f'{self.nome} já está comendo')
            return
        
        if self.falando:
            print(f'{self.nome} não  pde comer falando')
            return
        
        print(f'{self.nome} está comendo {alimento}')
        self.comendo = True
        
        
    def pararComer(self):
        
        if not self.comendo:
            print(f'{self.nome} já não está mais comendo')
            return

        print(f'{self.nome} parou de comer')
        self.comendo = False
        
    
    def falar(self, assunto):
        
        if self.falando:
            print(f'{self.nome} já está falando')
            return
        
        if self.comendo:
            print(f'{self.nome} não pode falar comendo')
            return
        
        print(f'{self.nome} está falando sobre {assunto}')
        self.falando = True
        
    
    def pararFalar(self):
        
        if not self.falando:
            print(f'{self.nome} já não está falando')
            return
    
        print(f'{self.nome} parou de falar')
        self.falando = False
    
    
    def getAnoNascimento(self):
        return Pessoa.anoAtual - self.idade
    
    
    @classmethod
    def porAnoNascimento(cls, nome, anoNascimento):
        
        idade = cls.anoAtual - anoNascimento
        
        return cls(nome, idade)
    
    
    @staticmethod
    def geraId():
        return randint(1000, 9999)
    
    

p1 = Pessoa('Luiz', 29)

print(p1.getAnoNascimento())
p1.comer('maça')
p1.comer('pizza')
p1.falar('aaaaaaaa')
p1.pararFalar()
p1.pararComer()
p1.pararComer()
p1.falar('CU')

p2 = Pessoa.porAnoNascimento('João', 1987)

print(p2.getAnoNascimento())

print(Pessoa.geraId(), p2.geraId())
    