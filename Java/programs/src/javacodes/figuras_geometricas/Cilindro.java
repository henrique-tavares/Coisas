package javacodes.figuras_geometricas;

public class Cilindro extends Figura3D
{
    private double raio;
    private double altura;

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public Cilindro(String cor, double raio, double altura)
    {
        super("Cilindro", cor);
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume()
    {
        return Math.pow(this.raio, 2) * Math.PI * this.altura;
    }

    
}