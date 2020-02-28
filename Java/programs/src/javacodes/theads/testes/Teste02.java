package javacodes.theads.testes;

import javacodes.theads.Thread02;

public class Teste02
{
    public static void main(String[] args)
    {
        Thread02 thread1 = new Thread02("Thread #1", 300, 12);
        Thread02 thread2 = new Thread02("Thread #2", 650, 9);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");

    }
}