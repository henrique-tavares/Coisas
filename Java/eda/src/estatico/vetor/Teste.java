package estatico.vetor;

public class Teste
{
    public static void main(String[] args)
    {
        Vetor<String> vet = new Vetor<>();

        vet.adiciona("1");
        vet.adiciona("aaaaaaaaaaaaaaa");
        vet.adiciona("A");
        vet.adiciona("777");
        vet.adiciona("Coronga");

        System.out.println(vet);
        
        vet.adiciona(0, "corsinha");
        System.out.println(vet);

        vet.adiciona(3, "cortei");
        System.out.println(vet);

        vet.adiciona(6, "true");
        System.out.println(vet);
        
        vet.remove(1);
        System.out.println(vet);

        vet.remove("true");
        System.out.println(vet);
        
        vet.adiciona("corsinha");
        System.out.println(vet);

        System.out.println("Contém 'aaaaa' ? " + vet.contem("aaaaa"));
        System.out.println("Contém 'corsinha' ? " + vet.contem("corsinha"));

        System.out.println("corsinha - pos: " + vet.indice("corsinha") + " (Primeiro)");
        System.out.println("corsinha - pos: " + vet.ultimoIndice("corsinha") + " (ultimo)");

        System.out.println(vet.obtem(5));

        vet.limpar();

        for (int i = 0; i < 35; i++)
        {
            vet.adiciona("#" + i);
        }

        System.out.println(vet);
    }
}