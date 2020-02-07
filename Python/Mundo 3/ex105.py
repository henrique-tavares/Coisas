def notas(*notas, sit=False):
    """
    -> Função para analisar notas e situações de vários alunos.
    :param *notas: uma ou mais notas dos alunos
    :param sit: valor opcional, indicando se deve ou não adicionar a situação
    :return: dicionário com várias informações sobre a situação da turma
    """

    d = {'total': len(notas), 'maior': max(notas), 'menor': min(notas), 'média': sum(notas) / len(notas)}
    
    if sit == True:
        
        if d['média'] < 5: d['situação'] = 'ruim'
        
        elif d['média'] < 7: d['situação'] = 'aceitável'
        
        elif d['média'] < 9: d['situação'] = 'boa'
        
        else: d['situação'] = 'excelente'
    
    return d

resp = notas(5.5, 9.5, 10, 6.5, sit=True)
print(f'\n{resp}\n')
