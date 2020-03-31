package javacodes.figuras_geometricas;

public class Piramide extends Figura3D
{
    private double lado;
    private double altura;

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public Piramide(String cor, double lado, double altura)
    {
        super("Pirâmide", cor);
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularVolume()
    {
        return (Math.pow(this.lado, 2) * this.altura) / 3;
    }
}