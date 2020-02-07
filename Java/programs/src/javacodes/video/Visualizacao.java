package javacodes.video;

public final class Visualizacao
{
    private Gafanhoto espectador;
    private Video filme;

    public void avaliar()
    {
        this.filme.like();
    }

    public void avaliar(int nota)
    {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porc)
    {
        this.filme.setAvaliacao((int) Math.round(porc / 10));
    }
    
    public Visualizacao(Gafanhoto espectador, Video filme)
    {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.ganhouView();
    }

    @Override
    public String toString()
    {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

    public Gafanhoto getEspectador()
    {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador)
    {
        this.espectador = espectador;
    }

    public Video getFilme()
    {
        return filme;
    }

    public void setFilme(Video filme)
    {
        this.filme = filme;
    }
}