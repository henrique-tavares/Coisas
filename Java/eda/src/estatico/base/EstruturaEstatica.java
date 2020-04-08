package estatico.base;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public abstract class EstruturaEstatica<T>
{
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade)
    {
        if (capacidade <= 0)
        {
            throw new IllegalArgumentException("Capacidade inválida");
        }

        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica()
    {
        this(10);
    }

    protected void adiciona(T elemento)
    {
        if (this.tamanho == this.elementos.length)
        {
            this.aumentaCapacidade();
        }

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    protected void adiciona(int pos, T elemento)
    {
        this.verificaPosicao(pos);

        if (this.tamanho == this.elementos.length)
        {
            this.aumentaCapacidade();
        }

        for (int i = this.tamanho - 1; i >= pos; i--)
        {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[pos] = elemento;
        this.tamanho++;
    }

    protected void remove(int posicao)
    {
        this.verificaPosicao(posicao);

        for (int i = posicao; i < (this.tamanho - 1); i++)
        {
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
        this.elementos[this.tamanho] = null;
    }

    public int tamanho()
    {
        return this.tamanho;
    }

    public boolean vazio()
    {
        return (this.tamanho == 0);
    }

    protected void aumentaCapacidade()
    {
        T[] newElementos = Arrays.copyOf(this.elementos, this.elementos.length * 2);

        this.elementos = newElementos;
    }

    protected void verificaPosicao(int pos)
    {
        if (pos < 0 || pos >= this.tamanho)
        {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho; i++)
        {
            if (i == this.tamanho - 1)
            {
                s.append(this.elementos[i]);
                continue;
            }

            s.append(this.elementos[i]);
            s.append(", ");
        }

        s.append("]");

        return s.toString();
    }
}