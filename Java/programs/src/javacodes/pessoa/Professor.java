package javacodes.pessoa;

public class Professor extends Pessoa
{
    private String especialidade;
    private double salario;

    public void receberAumento(double aumento)
    {
        this.salario += aumento;
    }    

    public String getEspecialidade()
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade)
    {
        this.especialidade = especialidade;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    /**
     * 
     * @param nome
     * @param idade
     * @param sexo
     * @param especialidade
     * @param salario
     */
    public Professor(String nome, int idade, Sexo sexo, String especialidade, double salario)
    {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

}