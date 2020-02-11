package javacodes.agenda;

@SuppressWarnings("serial")
public class ContatoNaoExisteException extends Exception
{
    public ContatoNaoExisteException(int id)
    {
        super("Não existe um contato com id: " + id);
    }
}