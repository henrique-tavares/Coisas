package dinamico.vetor;

public class Teste
{
	public static void main(String[] args)
	{
		Vetor<Integer> vet = new Vetor<>();

		vet.add(2);
		vet.add(4);
		vet.add(6);
		vet.add(8);
		System.out.println(vet);
		
		vet.add(0, 1);
		System.out.println(vet);

		vet.add(2, 3);
		System.out.println(vet);

		vet.add(4, 5);
		System.out.println(vet);

		vet.add(6, 7);
		System.out.println(vet);
		
		vet.add(8, 9);
		System.out.println(vet);
		
		System.out.println("\nContém 4? " + vet.contains(4));
		System.out.println("Contém 0? " + vet.contains(0));
		
		vet.set(0, -1);
		vet.set(5, 777);
		vet.set(8, 10);

		System.out.println(vet);
		
		vet.remove(8);
		vet.remove(0);		
		vet.remove(2);
		System.out.println(vet);
		
		vet.remove(Integer.valueOf(5));
		vet.remove(Integer.valueOf(8));
		vet.remove(Integer.valueOf(2));
		System.out.println(vet);
		
		vet.add(11);
		vet.add(12);
		vet.add(13);
		vet.add(14);
		System.out.println(vet);

		System.out.println("\n777 -> vet[" + vet.indexOf(777) + "]");
		System.out.println("vet[5] = " + vet.get(5));
	}
}