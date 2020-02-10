package javacodes.zoologico;

public abstract class Animal
{
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getComprimento()
    {
        return comprimento;
    }

    public void setComprimento(double comprimento)
    {
        this.comprimento = comprimento;
    }

    public int getPatas()
    {
        return patas;
    }

    public void setPatas(int patas)
    {
        this.patas = patas;
    }
    
    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getAmbiente()
    {
        return ambiente;
    }

    public void setAmbiente(String ambiente)
    {
        this.ambiente = ambiente;
    }

    public double getVelocidade()
    {
        return velocidade;
    }

    public void setVelocidade(double velocidade)
    {
        this.velocidade = velocidade;
    }

    protected Animal(String nome, double comprimento, String cor, String ambiente, double velocidade)
    {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    @Override
    public String toString()
    {
        return 
            "Animal: " + this.getNome() +
            "\nComprimento: " + this.getComprimento() + " cm" +
            "\nPatas: " + this.getPatas() +
            "\nCor: " + this.getCor() +
            "\nAmbiente: " + this.getAmbiente() +
            "\nVelocidade: " + this.getVelocidade() + " m/s";
    }

    

    // protected Animal(String nome, double comprimento, int patas, String ambiente, double velocidade)
    // {
    //     this.nome = nome;
    //     this.comprimento = comprimento;
    //     // this.patas = patas;
    //     this.ambiente = ambiente;
    //     this.velocidade = velocidade;
    // }
}