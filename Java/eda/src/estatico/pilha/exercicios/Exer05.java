package estatico.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exer05
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nDigite uma palavra ou frase para ver se ela é ou não um paíndromo:");
        
        String palavra = teclado.nextLine().replaceAll(" ", "");

        if (palindromo(palavra))
        {
            System.out.println("\nÉ um palíndromo");
        }
        
        else
        {
            System.out.println("\nNão é um palíndromo");
        }
        
        teclado.close();
    }

    public static boolean palindromo(String palavra)
    {
        Stack<Character> pilha = new Stack<>();

        String palavraInversa = "";

        for (int i = 0; i < palavra.length(); i++)
        {
            pilha.push(palavra.charAt(i));
        }

        while (!pilha.empty())
        {
            palavraInversa += pilha.pop();
        }

        System.out.println();
        System.out.println(palavra);
        System.out.println(palavraInversa);

        if (palavra.equalsIgnoreCase(palavraInversa))
        {
            return true;
        }

        return false;
    }
}