package javacodes.figuras_geometricas;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial
{
    /**
     * 
     * @param nome
     * @param cor
     */
    public Figura2D(String nome, String cor)
    {
        super(nome, cor);
    }
}