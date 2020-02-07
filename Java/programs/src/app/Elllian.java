package app;

import java.util.Scanner;

public class Elllian
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int tabela[][] = {{0,100},{0,50},{0,20},{0,10},{0,5},{0,2},{0,1}};

        int valor = teclado.nextInt();

        for (int i = 0; i < 7; i++)
        {
            tabela[i][0] = valor / tabela[i][1];
            valor %= tabela[i][1];

            System.out.println(tabela[i][0] + " nota(s) de R$" + String.format("%.2f", (float)tabela[i][1]));
        }

        teclado.close();
    }
}