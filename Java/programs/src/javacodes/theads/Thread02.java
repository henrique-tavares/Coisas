package javacodes.theads;

public class Thread02 implements Runnable
{
    private String nome;
    private int tempo;
    private int cont;

    public Thread02(String nome, int tempo, int cont)
    {
        this.nome = nome;
        this.tempo = tempo;
        this.cont = cont;
    }

    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i < this.cont; i++)
            {
                System.out.println(nome + " contador " + i);
                Thread.sleep(this.tempo);
            }
            System.out.println(nome + " terminou a execução");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}