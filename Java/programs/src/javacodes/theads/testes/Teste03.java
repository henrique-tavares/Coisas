package javacodes.theads.testes;

import javacodes.theads.ThreadSoma;

public class Teste03
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};

        ThreadSoma t1 = new ThreadSoma("#1", array);
        ThreadSoma t2 = new ThreadSoma("#2", array);
    }
}