package fila_estatica;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TesteQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(5);
        fila.add(7);
        fila.add(8);

        System.out.println("\nEstá vazio? " + fila.isEmpty());
        System.out.println("\nTamanho: " + fila.size());
        System.out.println("\n" + fila);
        System.out.println("\nPrimeiro da fila: " + fila.peek());
        System.out.println("\nDesenfileirando: " + fila.remove());
        System.out.println("\nDesenfileirando: " + fila.remove());
        System.out.println("\n" + fila);
        System.out.println();

        Queue<Integer> fila2 = new PriorityQueue<>();

        fila2.add(1);
        fila2.add(9);
        fila2.add(3);
        fila2.add(0);
        fila2.add(9);

        System.out.println("\n" + fila2);
        System.out.println();
    }
}