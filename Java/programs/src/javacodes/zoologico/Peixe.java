package javacodes.zoologico;

public class Peixe extends Animal
{
    private String caracteristica;

    public String getCaracteristica()
    {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica)
    {
        this.caracteristica = caracteristica;
    }

    public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade, String caracteristica)
    {
        super(nome, comprimento, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
        super.setPatas(0);
    }

    @Override
    public String toString()
    {
        return
            super.toString() +
            "\nCaracterística: " + this.getCaracteristica();
    }   
}