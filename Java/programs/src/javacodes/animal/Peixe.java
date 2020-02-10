package javacodes.animal;

public class Peixe extends Animal implements AnimalDomesticado
{
    private String corEscama;

    public void soltarBolha()
    {
        System.out.println("Soltando bolha.");
    }

    @Override
    public void locomover()
    {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo coisinhas.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("...");
    }

    @Override
    public void levarVeterinario()
    {
        System.out.println("O peixe foi no veterinário.");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corEscama
     */
    public Peixe(double peso, int idade, int membros, String corEscama)
    {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama()
    {
        return corEscama;
    }

    public void setCorEscama(String corEscama)
    {
        this.corEscama = corEscama;
    }
}