package dinamico.vetor;

import java.util.Iterator;

import dinamico.base.Elemento;
import dinamico.base.EstruturaDinamica;

public class Vetor<T> extends EstruturaDinamica<T>
{
	public Vetor()
	{
		super();
	}

	public void add(T valor)
	{
		super.pushBack(valor);
	}

	public void add(int index, T valor)
	{
		if (index < 0 || index > this.tamanho())
		{
			throw new IndexOutOfBoundsException("Posição inválida");
		}

		if (index == this.tamanho())
		{
			super.pushBack(valor);
			return;
		}

		if (index == 0)
		{
			super.pushFront(valor);
			return;
		}

		Iterator<Elemento<T>> it = this.iterator();
		for (int i = 0; i < (index - 1); i++)
		{
			it.next();
		}

		Elemento<T> e = it.next();

		Elemento<T> novo = new Elemento<>(valor);

		novo.setProx(e.getProx());
		novo.setAnt(e);

		e.getProx().setAnt(novo);
		e.setProx(novo);

		this.setTamanho(this.tamanho() + 1);
	}

	public void remove(int index)
	{
		if (index < 0 || index >= this.tamanho())
		{
			throw new IndexOutOfBoundsException();
		}

		if (index == 0)
		{
			super.popFront();
			return;
		}

		if (index == (this.tamanho() - 1))
		{
			super.popBack();
			return;
		}

		Iterator<Elemento<T>> it = this.iterator();
		for (int i = 0; i < index; i++)
		{
			it.next();
		}

		Elemento<T> old = it.next();

		Elemento<T> ant = old.getAnt();
		Elemento<T> prox = old.getProx();

		ant.setProx(prox);
		prox.setAnt(ant);

		old = null;

		this.setTamanho(this.tamanho() - 1);
	}

	public boolean remove(T valor)
	{
		Elemento<T> old = null;
		Iterator<Elemento<T>> it = this.iterator();

		while (it.hasNext())
		{
			old = it.next();

			if (old.getValor().equals(valor))
			{
				break;
			}
		}

		if (!it.hasNext())
		{
			return false;
		}

		if (old == this.getPrimeiro())
		{
			super.popFront();
			return true;
		}

		if (old == this.getUltimo())
		{
			super.popBack();
			return true;
		}

		Elemento<T> ant = old.getAnt();
		Elemento<T> prox = old.getProx();

		ant.setProx(prox);
		prox.setAnt(ant);

		old = null;

		this.setTamanho(this.tamanho() - 1);

		return true;
	}

	public boolean contains(T valor)
	{
		for (Elemento<T> e : this)
		{
			if (e.getValor().equals(valor))
			{
				return true;
			}
		}

		return false;
	}

	public int indexOf(T valor)
	{
		int i = 0;
		for (Elemento<T> e : this)
		{
			if (e.getValor().equals(valor))
			{
				return i;
			}

			i++;
		}

		return -1;
	}

	public T get(int index)
	{
		if (index < 0 || index >= this.tamanho())
		{
			throw new IndexOutOfBoundsException();
		}

		Iterator<Elemento<T>> it = this.iterator();
		for (int i = 0; i < index; i++)
		{
			it.next();
		}

		return it.next().getValor();
	}

	public void set(int index, T valor)
	{
		if (index < 0 || index >= this.tamanho())
		{
			throw new IndexOutOfBoundsException();
		}

		int i = 0;
		for (Elemento<T> e : this)
		{
			if (index == i)
			{
				e.setValor(valor);
			}

			i++;
		}
	}

	public void clear()
	{
		while (!this.empty())
		{
			this.popBack();
		}
	}
}