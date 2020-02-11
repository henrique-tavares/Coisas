package javacodes.calculadora_enum;

public enum CalculadoraOperacao
{
    SOMA('+')
    {
        @Override
        public double executarOperacao(double x, double y)
        {
            return x + y;
        }
    },

    SUBTRACAO('-')
    {
        @Override
        public double executarOperacao(double x, double y)
        {
            return x - y;
        }
    },
    
    MULTIPLICACAO('*')
    {
        @Override
        public double executarOperacao(double x, double y)
        {
            return x * y;
        }
    },

    DIVISAO('/')
    {
        @Override
        public double executarOperacao(double x, double y)
        {
            return x / y;
        }
    };

    private char operacao;

    private CalculadoraOperacao(char operacao)
    {
        this.operacao = operacao;
    }

    public char getOperacao()
    {
        return this.operacao;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString()
    {
        return Character.toString(this.getOperacao());
    }
}