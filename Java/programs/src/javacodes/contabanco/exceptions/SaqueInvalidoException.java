package javacodes.contabanco.exceptions;

@SuppressWarnings("serial")
public class SaqueInvalidoException extends RuntimeException
{
    public SaqueInvalidoException(String message)
    {
        super(message);
    }
}