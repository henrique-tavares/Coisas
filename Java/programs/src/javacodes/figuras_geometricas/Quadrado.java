package javacodes.figuras_geometricas;

public class Quadrado extends Figura2D
{
    private double lado;

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public Quadrado(String cor, double lado)
    {
        super("Quadrado", cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea()
    {
        return Math.pow(this.lado, 2);
    }
}