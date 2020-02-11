package testes;

public class TesteVarargs
{
    public static void main(String[] args)
    {
        System.out.println(soma(1,2,3,4,5,6,7,8,9));
        System.out.println(soma(465,135,6));
    }

    private static int soma(int... valores)
    {
        int soma = 0;

        for (int valor : valores)
        {
            soma += valor;
        }

        return soma;
    }
}