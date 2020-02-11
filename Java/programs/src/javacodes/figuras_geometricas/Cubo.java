package javacodes.figuras_geometricas;

public class Cubo extends Figura3D implements DimensaoVolumetrica
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

    public Cubo(String cor, double lado)
    {
        super("Cubo", cor);
        this.lado = lado;
    }

    @Override
    public double calcularVolume()
    {
        return Math.pow(this.lado, 3);
    }    
}