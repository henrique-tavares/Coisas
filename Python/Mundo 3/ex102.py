def fatorial(n, show=False):
    
    if n < 0: return '[ERRO] Valor fora do intervalo'
    
    elif n == 0 or n == 1:
        return f'{n}! = 1'
    
    else:
        fat = 1
        
        if show:
            res = f'{n}! = '
            
            for i in range(n,0,-1):
                fat *= i
                
                if i == 1:
                    res += f'{i}'
                
                else:
                    res += f'{i} x '
            
            res += f' = {fat}'
            
            return res
        
        else:
            
            for i in range(n,0,-1):
                fat *= i
            
            return fat
    
print('',fatorial(-5, show=True),'', sep='\n')