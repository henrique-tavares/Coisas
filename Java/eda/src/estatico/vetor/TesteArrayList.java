package estatico.vetor;

import java.util.ArrayList;

public class TesteArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> vet = new ArrayList<>();

        vet.add("1");
        vet.add("aaaaaaaaaaaaaaa");
        vet.add("A");
        vet.add("777");
        vet.add("Coronga");

        System.out.println(vet);
        
        vet.add(0, "corsinha");
        System.out.println(vet);

        vet.add(3, "cortei");
        System.out.println(vet);

        vet.add(6, "true");
        System.out.println(vet);
        
        vet.remove(1);
        System.out.println(vet);

        vet.remove("true");
        System.out.println(vet);
        
        vet.add("corsinha");
        System.out.println(vet);

        System.out.println("Contém 'aaaaa' ? " + vet.contains("aaaaa"));
        System.out.println("Contém 'corsinha' ? " + vet.contains("corsinha"));

        System.out.println("corsinha - pos: " + vet.indexOf("corsinha") + " (Primeiro)");
        System.out.println("corsinha - pos: " + vet.lastIndexOf("corsinha") + " (ultimo)");

        System.out.println(vet.get(5));

        vet.clear();

        for (int i = 0; i < 35; i++)
        {
            vet.add("#" + i);
        }

        System.out.println(vet);
    }
}