package javacodes.imposto_de_renda;

public abstract class Contribuinte
{
    private String nome;
    private double rendaBruta;

    public abstract double calcularImpostoDeRenda();

    public Contribuinte(String nome, double rendaBruta)
    {
        this.nome = nome;
        this.setRendaBruta(rendaBruta);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getRendaBruta()
    {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta)
    {
        if (rendaBruta >= 0)
        {
            this.rendaBruta = rendaBruta;
        }

        else
        {
            throw new IllegalArgumentException("A renda bruta não pode ser negativa.");
        }
    }

    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "; Renda bruta: " + this.getRendaBruta();
    }
}