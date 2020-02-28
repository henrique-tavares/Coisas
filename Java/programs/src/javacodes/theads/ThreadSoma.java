package javacodes.theads;

public class ThreadSoma implements Runnable
{
    private String nome;
    private int[] nums;
    private static SomaArray arr = new SomaArray();

    public ThreadSoma(String nome, int[] nums)
    {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, this.nome).start();
    }

    @Override
    public void run()
    {
        System.out.println(this.nome + " iniciada");
        
        int soma = arr.somar(this.nums);
        
        System.out.println("Resultado da soma para thead " + this.nome + " é " + soma);
        
        System.out.println(this.nome + " terminada");
    }

    
}