package javacodes.pessoa;

public abstract class Pessoa
{
    protected String nome;
    protected int idade;
    protected Sexo sexo;

    public void fazerAniversario()
    {
        this.idade++;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public Sexo getSexo()
    {
        return sexo;
    }

    public void setSexo(Sexo sexo)
    {
        this.sexo = sexo;
    }

    /**
     * 
     * @param nome Nome da pessoa
     * @param idade Idade da pessoa
     * @param sexo Sexo da pessoa: Sexo. (masculino, feminino ou outro)
     */
    protected Pessoa(String nome, int idade, Sexo sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}
