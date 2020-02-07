package javacodes.animal;

public class Lobo extends Mamifero
{
    public void enterrarOsso()
    {
        System.out.println("Osso enterrado!");
    }

    public void abanarRabo()
    {
        System.out.println("Abanou o rabo!");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Uivou!");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corPelo
     */
    public Lobo(double peso, int idade, int membros, String corPelo)
    {
        super(peso, idade, 4, corPelo);
    }
}