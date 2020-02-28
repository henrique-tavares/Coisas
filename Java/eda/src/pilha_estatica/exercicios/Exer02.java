package pilha_estatica.exercicios;

import java.util.Scanner;

import pilha_estatica.Pilha;

public class Exer02
{
    public static void main(String[] args)
    {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();

            if (num == 0)
            {
                System.out.println("Número 0:");

                // Pilha par

                Integer parDesempilhado = par.desempilha();
                
                if (parDesempilhado == null)
                {
                    System.out.println("Pilha par está vazia");
                }
                else
                {
                    System.out.println("Desempilhando da pilha par: " + parDesempilhado);
                }

                // Pilha impar

                Integer imparDesempilhado = impar.desempilha();

                if (imparDesempilhado == null)
                {
                    System.out.println("Pilha impar está vazia");
                }
                else
                {
                    System.out.println("Desempilhando da pilha impar: " + imparDesempilhado);
                }
            }

            else if (num % 2 == 0)
            {
                par.empilha(num);
                System.out.println("Empilhando o número: " + num + " na pilha par");
            }
            
            else
            {
                impar.empilha(num);
                System.out.println("Empilhando o número: " + num + " na pilha impar");
            }

            System.out.println();
        }

        System.out.println("\nTodos os números foram lidos, agora o restante das duas pilhas será desempilhado");

        System.out.println("\nPilha par:");
        while (!par.vazio())
        {
            System.out.println("Desempilhando: " + par.desempilha());
        }

        System.out.println("\nPilha impar:");
        while (!impar.vazio())
        {
            System.out.println("Desempilhando: " + impar.desempilha());
        }

        teclado.close();
    }
}