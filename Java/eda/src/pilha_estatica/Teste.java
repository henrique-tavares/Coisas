package pilha_estatica;

public class Teste
{
    public static void main(String[] args)
    {
        Pilha<String> pilha = new Pilha<>();

        System.out.println(pilha);
        System.out.println("Topo: " + pilha.topo());
        System.out.println("Vazio? " + pilha.vazio());
        System.out.println("Desempilhando: " + pilha.desempilha());
        
        for (int i = 0; i < 25; i++)
        {
            pilha.empilha("prato #" + i);
            
            if (i % 2 == 0)
            {
                pilha.desempilha();
            }
        }
        
        System.out.println(pilha);
        System.out.println("Desempilhando: " + pilha.desempilha());
        
        System.out.println("Tamanho: " + pilha.tamanho());
        System.out.println(pilha);
        
        System.out.println("Topo: " + pilha.topo());
        System.out.println("Vazio ? " + pilha.vazio());
    }
}