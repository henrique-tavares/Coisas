package javacodes.animal;

public final class Tartaruga extends Reptil implements AnimalDomesticado, AnimalEstimacao
{

    @Override
    public void locomover()
    {
        System.out.println("Andando bem devagar quando observada.");
    }

    @Override
    public void brincar()
    {
        System.out.println("A tartaruga parece mais feliz depois de brincar.");
    }

    @Override
    public void levarPassear()
    {
        System.out.println("A tartaruga parece mais cansada depois do passeio.");
    }

    @Override
    public void levarVeterinario()
    {
        System.out.println("A tartaruga foi no veterinário");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corEscama
     */
    public Tartaruga(double peso, int idade, int membros, String corEscama)
    {
        super(peso, idade, 4, corEscama);
    }
}