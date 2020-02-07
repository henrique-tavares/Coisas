class Pizza:
    
    def __init__(self, pedaços : int = 8):
        self.pedaços = pedaços
    
    def ingredientes(self):
        return 'massa'

class Mussarela(Pizza):
    
    def __init__(self):
        super().__init__()
        self.sabor = 'Mussarela'
    
    def ingredientes(self):
        return f'{super().ingredientes()}, queijo mussarela, molho de tomate, orégano'




p1 = Pizza()

print(p1.ingredientes())

m1 = Mussarela()

print(m1.ingredientes())

print(m1.sabor, m1.pedaços)