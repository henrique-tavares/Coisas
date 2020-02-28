package pilha_estatica.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exer08
{
    public static void main(String[] args)
    {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de discos da torre de hanoi: ");

        int n = teclado.nextInt();

        for (int i = n; i > 0; i--)
        {
            original.push(i);
        }

        torreDeHanoi(n, original, destino, auxiliar);
        System.out.println("-----------------------");

        teclado.close();
    }

    public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar)
    {
        if (n > 0)
        {
            torreDeHanoi(n - 1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("-----------------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreDeHanoi(n - 1, auxiliar, destino, original);
        }
    }
}