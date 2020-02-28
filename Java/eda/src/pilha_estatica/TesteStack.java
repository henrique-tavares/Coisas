package pilha_estatica;

import java.util.Stack;

public class TesteStack
{
    public static void main(String[] args)
    {
        Stack<String> pilha = new Stack<>();

        // Pilha<String> pilha = new Pilha<>();

        System.out.println(pilha);
        // System.out.println("Topo: " + pilha.peek());
        System.out.println("Vazio? " + pilha.empty());
        // System.out.println("Desempilhando: " + pilha.pop());
        
        for (int i = 0; i < 25; i++)
        {
            pilha.push("prato #" + i);
            
            if (i % 2 == 0)
            {
                pilha.pop();
            }
        }
        
        System.out.println(pilha);
        System.out.println("Desempilhando: " + pilha.pop());
        
        System.out.println("Tamanho: " + pilha.size());
        System.out.println(pilha);
        
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Vazio ? " + pilha.empty());
    }
}