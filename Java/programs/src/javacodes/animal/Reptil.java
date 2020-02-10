package javacodes.animal;

public class Reptil extends Animal
{
    private String corEscama;

    @Override
    public void locomover()
    {
        System.out.println("Andando.");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo vegetais ou carne.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de réptil.");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corEscama
     */
    public Reptil(double peso, int idade, int membros, String corEscama)
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