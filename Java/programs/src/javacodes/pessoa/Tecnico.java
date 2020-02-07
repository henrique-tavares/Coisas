package javacodes.pessoa;

public class Tecnico extends Aluno
{
    private int registroProfissional;

    public void praticar()
    {

    }

    public int getRegistroProfissional()
    {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional)
    {
        this.registroProfissional = registroProfissional;
    }

    /**
     * 
     * @param nome
     * @param idade
     * @param sexo
     * @param matricula
     * @param curso
     * @param registroProfissional
     */
    public Tecnico(String nome, int idade, Sexo sexo, int matricula, String curso, int registroProfissional)
    {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }
}