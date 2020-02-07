package javacodes.video;

public final class Video implements AcoesVideo
{
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;

    public void ganhouView()
    {
        this.views++;
    }

    @Override
    public void like()
    {
        this.curtidas++;
    }

    @Override
    public void pause()
    {
        if (!this.isReproduzindo()) System.out.println("O vídeo já está pausado.");

        else
        {
            System.out.println("Pausando...");
            this.setReproduzindo(false);
        }
    }

    @Override
    public void play()
    {
        if (this.isReproduzindo()) System.out.println("O vídeo já está sendo reproduzido.");

        else
        {
            System.out.println("Reproduzindo...");
            this.setReproduzindo(true);
        }
    }

    /**
     * 
     * @param titulo Título do vídeo
     */
    public Video(String titulo)
    {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAvaliacao()
    {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao)
    {
        this.avaliacao = (int) Math.round((this.avaliacao + avaliacao)/this.views);
    }

    public int getViews()
    {
        return views;
    }

    public void setViews(int views)
    {
        this.views = views;
    }

    public int getCurtidas()
    {
        return curtidas;
    }

    public void setCurtidas(int curtidas)
    {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo()
    {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo)
    {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString()
    {
        return "Video [avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo
                + ", titulo=" + titulo + ", views=" + views + "]";
    }
}