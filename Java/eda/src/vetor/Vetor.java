package vetor;

import base.EstruturaEstatica;

public class Vetor<T> extends EstruturaEstatica<T>
{
    public Vetor(int capacidade)
    {
        super(capacidade);
    }

    public Vetor()
    {
        super();
    }

    @Override
    public void adiciona(T elemento)
    {
        super.adiciona(elemento);
    }

    @Override
    public void adiciona(int pos, T elemento)
    {
        super.adiciona(pos, elemento);
    }

    @Override
    public void remove(int pos)
    {
        super.remove(pos);
    }

    public void remove(T elemento)
    {
        int pos = this.indice(elemento);

        if (pos == -1)
        {
            throw new IllegalArgumentException("Elemento inexistente");
        }

        this.remove(pos);
    }

    public T obtem(int pos)
    {
        verificaPosicao(pos);

        return this.elementos[pos];
    }

    public int indice(T elemento)
    {
        for (int i = 0; i < this.tamanho; i++)
        {
            if (this.elementos[i].equals(elemento))
            {
                return i;
            }
        }

        return -1;
    }

    public int ultimoIndice(T elemento)
    {
        for (int i = this.tamanho - 1; i >= 0; i--)
        {
            if (this.elementos[i].equals(elemento))
            {
                return i;
            }
        }

        return -1;
    }

    public boolean contem(T elemento)
    {
        return (this.indice(elemento) != -1);
    }

    public void limpar()
    {
        for (int i = 0; i < this.tamanho; i++)
        {
            this.elementos[i] = null;
        }
        
        this.tamanho = 0;
    }
}