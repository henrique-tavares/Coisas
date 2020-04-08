package dinamico.fila;

import java.util.NoSuchElementException;

import dinamico.base.Elemento;
import dinamico.base.EstruturaDinamica;

public class Fila<T> extends EstruturaDinamica<T>
{
	public Fila()
	{
		super();
	}

	public void push(T valor)
	{
		super.pushBack(valor);
	}

	public T pop()
	{
		if (this.empty())
		{
			throw new NoSuchElementException("Fila Vazia!");
		}

		T aux = this.getPrimeiro().getValor();

		super.popFront();

		return aux;
	}

	public T peek()
	{
		if (this.empty())
		{
			throw new NoSuchElementException("Fila Vazia!");
		}

		return this.getPrimeiro().getValor();
	}

	public int search(T obj)
	{
		int index = 0;
		for (Elemento<T> e : this)
		{
			if (e.getValor().equals(obj))
			{
				return index;
			}

			index++;
		}

		return -1;
	}
}