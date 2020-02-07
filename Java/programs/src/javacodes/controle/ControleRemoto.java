package javacodes.controle;

public class ControleRemoto implements Controlador
{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean mudo;
    private int altVolume;


    public int getVolume() 
    {
        return this.volume;
    }

    public void setVolume(int volume) 
    {
        this.volume = volume;
    }

    public boolean isLigado() 
    {
        return this.ligado;
    }

    public boolean getLigado() 
    {
        return this.ligado;
    }

    public void setLigado(boolean ligado) 
    {
        this.ligado = ligado;
    }

    public boolean isTocando() 
    {
        return this.tocando;
    }

    public boolean getTocando() 
    {
        return this.tocando;
    }

    public void setTocando(boolean tocando) 
    {
        this.tocando = tocando;
    }

    public boolean isMudo() 
    {
        return this.mudo;
    }

    public boolean getMudo() 
    {
        return this.mudo;
    }

    public void setMudo(boolean mudo) 
    {
        this.mudo = mudo;
    }
    
    public ControleRemoto() 
    {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
        this.setMudo(false);
    }

    @Override
    public void ligar()
    {
        this.setLigado(true);
    }

    @Override
    public void desligar()
    {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu()
    {
        System.out.println("Ligado? " + this.getLigado());

        if (!this.isMudo())
        {
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i <= this.getVolume(); i += 10)
            {
                System.out.print("|");
            }
            System.out.println("");
        }
        else if (this.isMudo()) System.out.println("Mudo");

        System.out.println("Tocando? " + this.getTocando());
    }

    @Override
    public void fecharMenu()
    {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume()
    {
        if (this.isLigado() && !this.isMudo())
            this.setVolume(this.getVolume() + 1); 
    }

    @Override
    public void menosVolume()
    {
        if (this.isLigado() && !this.isMudo() && (this.getVolume() > 0))
            this.setVolume(this.getVolume() - 1);
    }

    @Override
    public void ligarMudo()
    {
        if (this.isLigado() && !this.isMudo())
        {
            this.setMudo(true);
            this.altVolume = this.getVolume();
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo()
    {
        if (this.isLigado() && !this.isMudo())
        {
            this.setMudo(false);
            this.setVolume(this.altVolume);
        }
    }

    @Override
    public void play()
    {
        if (this.isLigado() && !this.isTocando())
            this.setTocando(true);
    }

    @Override
    public void pause()
    {
        if (this.isLigado() && this.isTocando())
            this.setTocando(false);
    }
}