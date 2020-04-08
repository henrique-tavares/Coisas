package dinamico.fila;

public class Teste
{
	public static void main(String[] args)
	{
		Fila<String> fila = new Fila<>();

		try
		{
			System.out.println("Primeiro: " + fila.peek());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		fila.push("Coronga");
		fila.push("Corsinha");
		fila.push("zerbit");
		fila.push("filtros");

		System.out.println("Corsinha -> pos: " + fila.search("Corsinha"));
		System.out.println("filtros -> pos: " + fila.search("filtros"));
		System.out.println("zerbit -> pos: " + fila.search("zerbit"));
		System.out.println("Coronga -> pos: " + fila.search("Coronga"));

		while(!fila.empty())
		{
			System.out.println("Primeiro: " + fila.pop());
		}
	}
}