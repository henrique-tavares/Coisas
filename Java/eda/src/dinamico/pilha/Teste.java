package dinamico.pilha;

public class Teste
{
	public static void main(String[] args)
	{
		Pilha<String> pilha = new Pilha<>();

		try
		{
			System.out.println("Topo: " + pilha.peek());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		pilha.push("Coronga");
		pilha.push("Corsinha");
		pilha.push("zerbit");
		pilha.push("filtros");

		System.out.println("Corsinha -> pos: " + pilha.search("Corsinha"));
		System.out.println("filtros -> pos: " + pilha.search("filtros"));
		System.out.println("zerbit -> pos: " + pilha.search("zerbit"));
		System.out.println("Coronga -> pos: " + pilha.search("Coronga"));

		while(!pilha.empty())
		{
			System.out.println("Topo: " + pilha.pop());
		}
	}
}