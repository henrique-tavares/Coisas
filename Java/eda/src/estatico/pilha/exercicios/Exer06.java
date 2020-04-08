package estatico.pilha.exercicios;

import java.util.Scanner;

import estatico.pilha.Pilha;

public class Exer06
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite uma expressão matemática: ");
        String expressao = teclado.nextLine();

        if (verificaExpressao(expressao))
        {
            System.out.println("\nÉ uma expressão válida\n");
        }
        else
        {
            System.out.println("\nNão é uma expressão válida\n");
        }

        teclado.close();
    }

    final static String ABRE = "{[(", FECHA = "}])";

    public static boolean verificaExpressao(String expressao)
    {
        Pilha<Character> simbolos = new Pilha<>();

        for (int i = 0; i < expressao.length(); i++)
        {
            char simbolo = expressao.charAt(i);

            if (ABRE.indexOf(simbolo) != -1)
            {
                simbolos.empilha(simbolo);
            }

            else if (FECHA.indexOf(simbolo) != -1)
            {
                if (simbolos.vazio())
                {
                    return false;
                }

                if (FECHA.indexOf(simbolo) == ABRE.indexOf(simbolos.topo()))
                {
                    simbolos.desempilha();
                }
                else
                {
                   simbolos.empilha(simbolo);
                }
            }
        }

        if (simbolos.vazio())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}