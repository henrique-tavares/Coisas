package javacodes.imposto_de_renda;

public class PessoaJuridica extends Contribuinte
{
    private String cnpj;

    @Override
    public double calcularImpostoDeRenda()
    {
        return super.getRendaBruta() * 10 / 100;
    }

    public PessoaJuridica(String nome, double rendaBruta, String cnpj)
    {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    @Override
    public String toString()
    {
        return "Pessoa Jurídica [ " + super.toString() + "; CNPJ: " + this.getCnpj() + "; Imposto de renda: " + this.calcularImpostoDeRenda() + " ]\n";
    }

    
}