package javacodes.animal;

public final class Cobra extends Reptil
{
    @Override
    public void locomover()
    {
        System.out.println("Rastejando.");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corEscama
     */
    public Cobra(double peso, int idade, int membros, String corEscama)
    {
        super(peso, idade, 0, corEscama);
    }
}