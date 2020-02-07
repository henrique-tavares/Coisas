package javacodes.video;

public abstract class Pessoa
{
    protected String nome, sexo;
    protected int idade, experiencia;
    
    protected void ganharExp()
    {
        this.experiencia++;
    }
    
    /**
     * 
     * @param nome
     * @param sexo
     * @param idade
     */
    public Pessoa(String nome, String sexo, int idade)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }

    @Override
    public String toString()
    {
        return "Pessoa [experiencia=" + experiencia + ", idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getExperiencia()
    {
        return experiencia;
    }

    public void setExperiencia(int experiencia)
    {
        this.experiencia = experiencia;
    }
}