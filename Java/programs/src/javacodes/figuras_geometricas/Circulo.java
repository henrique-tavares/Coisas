package javacodes.figuras_geometricas;

public class Circulo extends Figura2D implements DimensaoSuperficial
{
    private double raio;

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }

    public Circulo(String cor, double raio)
    {
        super("Círculo", cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea()
    {
        return Math.pow(this.raio, 2) * Math.PI;
    }
}