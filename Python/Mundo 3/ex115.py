import modulos.menu as m

pathArquivo = "Python/Mundo 3/modulos/pessoas.txt"
    
try:
    arquivo = open(pathArquivo, 'x')
    
except:
    pass
    
else:
    arquivo.close()
        
while True:
    
    m.clear()
    
    resposta = m.menu(['Ver pessoas cadastradas', 'Cadastrar nova pessoa', 'Sair do programa'])
    
    m.clear()
        
    if resposta == 1:
        m.acessar(pathArquivo)
        m.pause()
    
    elif resposta == 2:
        m.cadastrar(pathArquivo)
    
    elif resposta == 3:
        m.sair()