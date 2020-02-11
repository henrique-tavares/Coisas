import javacodes.recursivo.Recursivo;

// @SuppressWarnings("unused")
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("\nDigite um número para calcular o seu fatorial: ");
        long num = Input.teclado.nextLong();

        System.out.printf("%n%e%n%n", Recursivo.fatorial(num));

    }
}