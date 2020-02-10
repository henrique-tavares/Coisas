package javacodes.imposto_de_renda;

public class PessoaFisica extends Contribuinte
{
    private String cpf;

    @Override
    public double calcularImpostoDeRenda()
    {
        double renda = super.getRendaBruta();

        if (renda <= 1400) return 0;

        else if (renda <= 2100) return (renda * 10 / 100) - 100;

        else if (renda <= 2800) return (renda * 15 / 100) - 270;

        else if (renda <= 3600) return (renda * 25 / 100) - 500;

        else return (renda * 30 / 100) - 700;
    }

    public PessoaFisica(String nome, double rendaBruta, String cpf)
    {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    @Override
    public String toString()
    {
        return "Pessoa física [ " + super.toString() + "; CPF: " + this.getCpf() + "; Imposto de renda: " + this.calcularImpostoDeRenda() + " ]\n";
    }
}