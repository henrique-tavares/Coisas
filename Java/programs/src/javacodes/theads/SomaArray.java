package javacodes.theads;

public class SomaArray
{
    private int soma;

    public synchronized int somar(int[] array)
    {
        this.soma = 0;

        for (int num : array)
        {
            this.soma += num;

            System.out.println(
                "Executando a soma " + Thread.currentThread().getName() +
                " somando o valor " + num + " com o total de " + this.soma
            );

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        return this.soma;
    }
}