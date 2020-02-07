package javacodes.pessoa;

public class Bolsista extends Aluno
{
    private double bolsa;

    public void renovarBolsa()
    {
        System.out.println("Renovando a bolsa.");
    }
    
    @Override
    public void pagarMensalidade()
    {
        System.out.println("Pagando a mensalidade com bolsa.");
    }

    public Bolsista(String nome, int idade, Sexo sexo, int matricula, String curso, double bolsa)
    {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public double getBolsa()
    {
        return bolsa;
    }

    public void setBolsa(double bolsa)
    {
        this.bolsa = bolsa;
    }
    
}