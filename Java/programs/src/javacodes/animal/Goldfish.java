package javacodes.animal;

public final class Goldfish extends Peixe
{
    @Override
    public void levarVeterinario()
    {
        System.out.println("O peixe-dourado foi no veterinário");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corEscama
     */
    public Goldfish(double peso, int idade, int membros, String corEscama)
    {
        super(peso, idade, 2, "Dourado");
    }
}