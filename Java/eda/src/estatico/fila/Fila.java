package estatico.fila;

import estatico.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>
{
    public Fila(int capacidade)
    {
        super(capacidade);
    }

    public Fila()
    {
        super();
    }

    public void enfileira(T elemento)
    {
        super.adiciona(elemento);
    }

    public T espiar()
    {
        if (this.vazio())
        {
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileira()
    {
        if (this.vazio())
        {
            return null;
        }

        T elemento = this.elementos[0];

        super.remove(0);

        return elemento;
    }
}