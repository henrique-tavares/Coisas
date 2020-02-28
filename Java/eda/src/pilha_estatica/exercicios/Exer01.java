package pilha_estatica.exercicios;

import java.util.Scanner;

import pilha_estatica.Pilha;

public class Exer01
{
    public static void main(String[] args)
    {
        Pilha<Integer> pilha = new Pilha<>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();

            if (num % 2 == 0)
            {
                pilha.empilha(num);
                System.out.println("Número par, empilhando o número: " + num);
            }
            else
            {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null)
                {
                    System.out.println("Pilha está vazia");
                }
                else
                {
                    System.out.println("Número ímpar, desempilhando o número: " + desempilhado);
                }
            }

            System.out.println();
        }

        System.out.println("\nTodos os números foram lidos, agora o restante será desempilhado:");

        while (!pilha.vazio())
        {
            System.out.println("Desempilhando: " + pilha.desempilha());
        }

        teclado.close();
    }
}