package javacodes.animal;

public final class Arara extends Ave implements AnimalDomesticado
{
    @Override
    public void levarVeterinario()
    {
        System.out.println("A arara foi no veterinário.");
    }
    
    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corPena
     */
    public Arara(double peso, int idade, int membros, String corPena)
    {
        super(peso, idade, 4, corPena);
    }
}