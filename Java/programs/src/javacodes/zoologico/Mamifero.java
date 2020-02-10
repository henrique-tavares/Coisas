package javacodes.zoologico;

public class Mamifero extends Animal
{
    private String alimento;

    public String getAlimento()
    {
        return alimento;
    }

    public void setAlimento(String alimento)
    {
        this.alimento = alimento;
    }

    public Mamifero(String nome, double comprimento, String cor, String ambiente, double velocidade, String alimento)
    {
        super(nome, comprimento, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    @Override
    public String toString()
    {
        return
            super.toString() +
            "\nAlimento: " + this.getAlimento();
    }
}