package javacodes.animal;

public class Ave extends Animal
{
    private String corPena;

    public void fazerNinho()
    {
        System.out.println("Ninho construído!");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de ave.");
    }

    @Override
    public void locomover()
    {
        System.out.println("Voando.");
    }
    
    public String getCorPena()
    {
        return corPena;
    }

    public void setCorPena(String corPena)
    {
        this.corPena = corPena;
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corPena
     */
    public Ave(double peso, int idade, int membros, String corPena)
    {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
}