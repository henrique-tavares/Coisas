class CarrinhoDeCompras:
    
    def __init__(self):    
        self.__produtos = []
        
    @property
    def produtos(self):
        return self.__produtos
        
    def inserirProdutos(self, *produtos):
        
        for produto in produtos:
            self.produtos.append({'nome': produto.nome, 'valor': produto.valor})
    
    def listaProdutos(self):
        
        for produto in self.produtos:
            print(produto['nome'], produto['valor'])
    
    def somaTotal(self):
        
        total = 0
        
        for produto in self.produtos:
            total += produto['valor']
            
        return total


class Produto:
    
    def __init__(self, nome, valor):
        self.nome = nome
        self.valor = valor
    
    @property
    def nome(self):
        return self._nome
    
    @nome.setter
    def nome(self, nome):
        self._nome = nome.title()
    
    @property
    def valor(self):
        return self._valor
    
    @valor.setter
    def valor(self, valor):
                
        if isinstance(valor, str):
            
            try:
                valor = float(valor.replace('R$','').replace(' ','').replace(',','.'))
            
            except:
                valor = -1
        
        self._valor = valor


carrinho = CarrinhoDeCompras()

p1 = Produto('iphone', 'R$3999,99')
p2 = Produto('Camisa', 52)
p3 = Produto('Teclado', 120)

carrinho.inserirProdutos(p1, p2, p3, p2)

carrinho.listaProdutos()
print(carrinho.produtos)

print(carrinho.somaTotal())