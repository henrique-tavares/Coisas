package pilha_estatica;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>
{
    public Pilha(int capacidade)
    {
        super(capacidade);
    }

    public Pilha()
    {
        super();
    }

    public void empilha(T elemento)
    {
        super.adiciona(elemento);
    }

    public T desempilha()
    {
        if (this.vazio())
        {
            return null;
        }

        T elemento = this.elementos[this.tamanho - 1];

        super.remove(this.tamanho - 1);

        return elemento;
    }

    public T topo()
    {
        if (this.vazio())
        {
            return null;
        }

        return this.elementos[this.tamanho - 1];
    }
}