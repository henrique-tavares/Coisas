from os import walk, path

def formatSize(fileSize):
    
    base = 1024
    labels = ['Bytes', 'KB', 'MB', 'GB', 'TB', 'PB']
    
    for i, label in enumerate(labels):
        
        if fileSize < base**(i+1):
            
            return f'{round(fileSize / (base**i), 2)} {label}'
                

try:
    searchPath = input('Digite um Caminho: ')
    searchWord = [x.strip() for x in input('Digite um ou vários termos: ').split(',')]

except KeyboardInterrupt:
    print('\n\nPrograma interrompido pelo usuário\n')
    exit()

fileQtd = 0
totalSize = 0

for root, dirs, files in walk(searchPath):
    
    for file in files:
        for word in searchWord:
            if word in file:
                
                try:
                    fullPath = path.join(root, file)
                    fileName, fileExt = path.splitext(file)
                    fileSize = path.getsize(fullPath)
                    
                    fileQtd += 1
                    totalSize += fileSize
                    
                    print()
                    print('Encontrei o arquivo:', file)
                    print('Caminho: ', fullPath)
                    print('Nome:', fileName)
                    print('Extensão:', fileExt.replace('.',''))
                    print('Tamanho (bytes):', fileSize)
                    print('Tamanho formatado:', formatSize(fileSize))
                
                except PermissionError:
                    print("Sem permissão neste arquivo")
                
                except FileNotFoundError:
                    print('Arquivo não encontrado')
                
                except Exception as e:
                    print('Erro desconhecido:', e)
                
                finally:
                    print()

print(f'{fileQtd} arquivo(s) encontrado(s)')
print('Tamanho total:', formatSize(totalSize), end='\n\n')