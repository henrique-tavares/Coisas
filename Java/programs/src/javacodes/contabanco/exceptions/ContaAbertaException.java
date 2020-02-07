package javacodes.contabanco.exceptions;

@SuppressWarnings("serial")
public class ContaAbertaException extends RuntimeException
{
    public ContaAbertaException(String message)
    {
        super(message);
    }
}
