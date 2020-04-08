package dinamico.base;

public class Elemento<T>
{
	private T valor;
	private Elemento<T> ant;
	private Elemento<T> prox;

	public Elemento(T valor)
	{
		this.valor = valor;
		this.ant = null;
		this.prox = null;
	}

	public T getValor()
	{
		return valor;
	}

	public void setValor(T valor)
	{
		this.valor = valor;
	}

	public Elemento<T> getAnt()
	{
		return ant;
	}

	public void setAnt(Elemento<T> ant)
	{
		this.ant = ant;
	}

	public Elemento<T> getProx()
	{
		return prox;
	}

	public void setProx(Elemento<T> prox)
	{
		this.prox = prox;
	}

	@Override
	public String toString()
	{
		return this.valor.toString();
	}

}