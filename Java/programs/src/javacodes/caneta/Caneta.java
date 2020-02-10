package javacodes.caneta;

public class Caneta
{
    private String modelo;
    private String cor;
    private double ponta;
    private double carga;
    private boolean tampada;

    public void getStatus()
    {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampada? " + this.getTampada());
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public void setModelo(String s)
    {
        this.modelo = s;
    }

    public String getCor()
    {
        return this.cor;
    }
    
    public void setCor(String s)
    {
        this.cor = s;
    }
    
    public double getPonta()
    {
        return this.ponta;
    }
    
    public void setPonta(Double d)
    {
        this.ponta = d;
    }
    
    public double getCarga()
    {
        return this.carga;
    }
    
    public void setCarga(Double d)
    {
        this.carga = d;
    }
    
    public boolean getTampada()
    {
        return this.tampada;
    }
    
    public void setTampada(Boolean b)
    {
        this.tampada = b;
    }

    public Caneta()
    {
        this.setCarga(100.0);
        this.setTampada(true);
    }
}