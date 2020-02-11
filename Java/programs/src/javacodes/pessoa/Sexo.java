package javacodes.pessoa;

public enum Sexo
{
    MASCULINO('M'), FEMININO('F'), OUTRO('O');

    private char valor;

    private Sexo(char valor)
    {
        this.valor = valor;
    }

    public char getValor()
    {
        return valor;
    }
}