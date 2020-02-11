package javacodes.agenda;

public class Contato
{
    private static int idAux = 0;

    private int id;
    private String nome;
    private String telefone;

    public int getId()
    {
        return id;
    }

    private void createId()
    {
        this.id = Contato.idAux;
        Contato.idAux++;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public Contato(String nome, String telefone)
    {
        this.createId();
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nTelefone: " + this.getTelefone();
    }
}