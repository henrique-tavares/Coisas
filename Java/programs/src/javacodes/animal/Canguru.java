package javacodes.animal;

public final class Canguru extends Mamifero
{
    public void usarBolsa()
    {
        System.out.println("Usando a bolsa.");
    }

    @Override
    public void locomover()
    {
        System.out.println("Pulando.");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corPelo
     */
    public Canguru(double peso, int idade, int membros, String corPelo)
    {
        super(peso, idade, 4, corPelo);
    }

}