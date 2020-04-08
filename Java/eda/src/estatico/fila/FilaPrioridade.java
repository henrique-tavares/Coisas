package estatico.fila;

@SuppressWarnings("unchecked")
public class FilaPrioridade<T> extends Fila<T>
{
    public FilaPrioridade(int capacidade)
    {
        super(capacidade);
    }
    
    public FilaPrioridade()
    {
        super();
    }

    @Override
    public void enfileira(T elemento)
    {
        // if (this.vazio())
        // {
        //     super.adiciona(elemento);
        //     return;
        // }

        Comparable<T> chave = (Comparable<T>) elemento;

        int i = 0;
        for (; i < this.tamanho; i++)
        {
            if (chave.compareTo(this.elementos[i]) < 0)
            {
                break;
            }
        }

        if (i == this.tamanho)
        {
            super.adiciona(elemento);
        }
        else
        {
            super.adiciona(i, elemento);
        }

    } 
}