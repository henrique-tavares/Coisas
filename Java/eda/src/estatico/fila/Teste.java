package estatico.fila;

public class Teste
{
    public static void main(String[] args)
    {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(5);
        fila.enfileira(7);
        fila.enfileira(8);

        System.out.println("\nEstá vazio? " + fila.vazio());
        System.out.println("\nTamanho: " + fila.tamanho());
        System.out.println("\n" + fila);
        System.out.println("\nPrimeiro da fila: " + fila.espiar());
        System.out.println("\nDesenfileirando: " + fila.desenfileira());
        System.out.println("\nDesenfileirando: " + fila.desenfileira());
        System.out.println("\n" + fila);
        System.out.println();

        FilaPrioridade<Integer> fila2 = new FilaPrioridade<>();

        fila2.enfileira(1);
        fila2.enfileira(9);
        fila2.enfileira(3);
        fila2.enfileira(0);
        fila2.enfileira(9);

        System.out.println("\n" + fila2);
        System.out.println();
    }
}