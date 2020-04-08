package dinamico.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class EstruturaDinamica<T> implements Iterable<Elemento<T>>
{
	private Elemento<T> primeiro;
	private Elemento<T> ultimo;
	private int tamanho;

	protected Elemento<T> getPrimeiro()
	{
		return primeiro;
	}

	protected void setPrimeiro(Elemento<T> primeiro)
	{
		this.primeiro = primeiro;
	}

	protected Elemento<T> getUltimo()
	{
		return ultimo;
	}

	protected void setUltimo(Elemento<T> ultimo)
	{
		this.ultimo = ultimo;
	}

	public int tamanho()
	{
		return tamanho;
	}

	protected void setTamanho(int tamanho)
	{
		this.tamanho = tamanho;
	}

	public EstruturaDinamica()
	{
		this.primeiro = null;
		this.ultimo = null;
	}

	private void init(T e)
	{
		Elemento<T> elemento = new Elemento<>(e);

		this.primeiro = elemento;
		this.ultimo = elemento;

		this.tamanho++;
	}

	protected void pushBack(T e)
	{
		if (this.empty())
		{
			this.init(e);
			return;
		}

		Elemento<T> elemento = new Elemento<>(e);

		this.tamanho++;

		elemento.setAnt(this.ultimo);
		this.ultimo.setProx(elemento);
		this.setUltimo(elemento);
	}

	protected void pushFront(T e)
	{
		if (this.empty())
		{
			this.init(e);
			return;
		}

		Elemento<T> elemento = new Elemento<>(e);

		this.tamanho++;

		elemento.setProx(this.primeiro);
		this.primeiro.setAnt(elemento);
		this.setPrimeiro(elemento);
	}

	@SuppressWarnings("unused")
	protected void popBack()
	{
		if (this.empty())
		{
			throw new NoSuchElementException(this.getClass() + " vazia!");
		}

		Elemento<T> aux = this.ultimo;

		this.setUltimo(this.ultimo.getAnt());

		if (this.ultimo != null)
		{
			this.ultimo.setProx(null);
		}

		aux = null;
		
		this.tamanho--;
	}
	
	@SuppressWarnings("unused")
	protected void popFront()
	{
		if (this.empty())
		{
			throw new NoSuchElementException(this.getClass() + " vazia!");
		}

		Elemento<T> aux = this.ultimo;

		this.setPrimeiro(this.primeiro.getProx());
		
		if (this.primeiro != null)
		{
			this.primeiro.setAnt(null);
		}

		aux = null;

		this.tamanho--;
	}
	
	public boolean empty()
	{
		return (this.tamanho == 0);
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder("[");

		for (Elemento<T> e : this)
		{
			if (e == this.getPrimeiro())
			{
				s.append(e.toString());
				continue;
			}

			s.append(", " + e);
		}

		s.append("]");

		return s.toString();
	}

	@Override
	public Iterator<Elemento<T>> iterator()
	{
		return new MyIterator<T>(this);
	}
}