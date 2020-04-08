package dinamico.base;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<Elemento<T>>
{
	private Elemento<T> ant;
	private Elemento<T> atual;
	private Elemento<T> prox;
	
	public MyIterator(EstruturaDinamica<T> obj)
	{
		this.ant = null;
		this.atual = null;
		this.prox = obj.getPrimeiro();
	}
	
	@Override
	public boolean hasNext()
	{
		return (this.prox != null);
	}
	
	@Override
	public Elemento<T> next()
	{
		this.ant = this.atual;
		this.atual = this.prox;
		this.prox = this.prox.getProx();
				
		return this.atual;
	}

	public boolean hasPrevious()
	{
		return (this.ant != null);
	}

	public Elemento<T> previous()
	{
		this.prox = this.atual;
		this.atual = this.ant;
		this.ant = this.ant.getAnt();

		return this.ant;
	}
}