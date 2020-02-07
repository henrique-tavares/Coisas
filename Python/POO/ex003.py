class BaseDeDados:
    
    def __init__(self):
        self.__dados = {}
    
    
    @property
    def dados(self):
        return self.__dados
    
        
    def inserirCliente(self, id, nome):
        
        if 'clientes' not in self.dados.keys():
            self.dados['clientes'] = {id: nome}
        
        else:
            self.dados['clientes'].update({id: nome})
            
        
    def listaClientes(self):
        
        if 'clientes' in self.dados.keys():
            for id, nome in self.dados['clientes'].items():
                
                print(f'id: {id:>3} nome: {nome}')
                
    
    def deletaCliente(self, id):
        
        if 'clientes' in self.dados.keys():
            
            try:
                del self.dados['clientes'][id]
                
            except KeyError:
                print(f'Não existe cliente com id: {id}')

bd = BaseDeDados()

bd.inserirCliente(1, 'Luiz')
bd.inserirCliente(2, 'Maria')
bd.listaClientes()
bd.deletaCliente(3)
bd.listaClientes()