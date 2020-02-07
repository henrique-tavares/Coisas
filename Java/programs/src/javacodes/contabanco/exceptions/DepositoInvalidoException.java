package javacodes.contabanco.exceptions;

@SuppressWarnings("serial")
public class DepositoInvalidoException extends  RuntimeException
{
    public DepositoInvalidoException(String message)
    {
        super(message);
    }
}