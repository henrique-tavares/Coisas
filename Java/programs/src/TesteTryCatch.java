public class TesteTryCatch
{
    public static void main(String[] args)
    {
        int[] numeradores = {4, 16, 32, 64, 128, 256};
        int[] denominadores = {2, 0, 8, 0, 4};

        for (int i = 0; i < numeradores.length; i++)
        {
            try
            {
                System.out.println(numeradores[i] + " / " + denominadores[i] + " = " + numeradores[i]/denominadores[i]);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Posição do array inválida");
            }
        }
    }
}