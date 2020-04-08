package dinamico.pilha;

import java.util.EmptyStackException;

import dinamico.base.Elemento;
import dinamico.base.EstruturaDinamica;

public class Pilha<T> extends EstruturaDinamica<T>
{
	public Pilha()
	{
		super();
	}

	public void push(T valor)
	{
		super.pushFront(valor);
	}

	public T pop()
	{
		if (this.empty())
		{
			throw new EmptyStackException();
		}

		T aux = this.getPrimeiro().getValor();
		super.popFront();

		return aux;
	}

	public T peek()
	{
		if (this.empty())
		{
			throw new EmptyStackException();
		}
		
		return this.getUltimo().getValor();
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