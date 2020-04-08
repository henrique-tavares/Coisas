package estatico.pilha.exercicios;

import estatico.pilha.Pilha;

public class Exer07
{
    public static void main(String[] args)
    {
        imprimeResultado(2, 2);
        
        imprimeResultado(4, 2);
        
        imprimeResultado(10, 2);
        
        imprimeResultado(25, 2);
        
        imprimeResultado(25, 16);

        imprimeResultado(10035, 2);

        imprimeResultado(10035, 8);

        imprimeResultado(10035, 16);
        
        System.out.println();
    }

    public static void imprimeResultado(int num, int base)
    {
        System.out.println("\nO número " + num + " na base " + base + " é " + decimalToBase(num, base));
    }
    
    final static String BASES = "0123456789ABCDEF";

    public static String decimalToBase(int num, int base)
    {
        if (base < 2 || base > 16)
        {
            throw new IllegalArgumentException("Base inválida");
        }

        Pilha<Integer> pilha = new Pilha<>();

        String numBase = "";

        for (;num > 0; num /= base)
        {
            pilha.empilha(num % base);
        }

        while (pilha.tamanho() % 4 != 0)
        {
            pilha.empilha(0);
        }

        while (!pilha.vazio())
        {
            numBase += BASES.charAt(pilha.desempilha());

            if (pilha.tamanho() % 4 == 0)
            {
                numBase += " ";
            }
        }

        return numBase;
    }
}