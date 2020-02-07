package javacodes.animal;

public final class Tartaruga extends Reptil
{

    @Override
    public void locomover()
    {
        System.out.println("Andando bem devagar quando observada.");
    }

    public Tartaruga(double peso, int idade, int membros, String corEscama)
    {
        super(peso, idade, 4, corEscama);
    }
}