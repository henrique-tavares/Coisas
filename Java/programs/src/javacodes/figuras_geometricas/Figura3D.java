package javacodes.figuras_geometricas;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica
{
    /**
     * 
     * @param nome
     * @param cor
     */
    public Figura3D(String nome, String cor)
    {
        super(nome, cor);
    }
}