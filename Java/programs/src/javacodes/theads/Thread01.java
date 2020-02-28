package javacodes.theads;

public class Thread01 extends Thread
{
    private String nome;
    private int tempo;
    private int cont;

    public Thread01(String nome, int tempo, int cont)
    {
        this.nome = nome;
        this.tempo = tempo;
        this.cont = (cont < 0) ? -cont : cont;
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
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}