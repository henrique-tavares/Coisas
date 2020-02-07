package javacodes.luta;

public class Lutador
{
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public String getNome() 
    {
        return this.nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNacionalidade() 
    {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) 
    {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() 
    {
        return this.idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public double getAltura() 
    {
        return this.altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getPeso() 
    {
        return this.peso;
    }

    public void setPeso(double peso) 
    {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() 
    {
        return this.categoria;
    }

    private void setCategoria() 
    {
        if (peso < 52.2) this.categoria = "Inválido";

        else if (peso <= 70.3) this.categoria = "Leve";

        else if (peso <= 83.9) this.categoria = "Médio";

        else if (peso <= 120.2) this.categoria = "Pesado";

        else this.categoria = "Inválido";
    }

    public int getVitorias() 
    {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) 
    {
        this.vitorias = vitorias;
    }

    public int getDerrotas() 
    {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) 
    {
        this.derrotas = derrotas;
    }

    public int getEmpates() 
    {
        return this.empates;
    }

    public void setEmpates(int empates) 
    {
        this.empates = empates;
    }

    /**
     * 
     * @param nome Nome do lutador
     * @param nacionalidade País de origem do lutador
     * @param idade Idade do lutador
     * @param altura Altura do lutador
     * @param peso Peso do lutador
     * @param vitorias Quantitade de vezes em que o lutador ganhou
     * @param derrotas Quantidade de vezes em que o lutador perdeu
     * @param empates Quantidade de vezes em que o lutador empatou
     */
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) 
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Lutador() 
    {
    }

    public void apresentar()
    {
        System.out.println("-------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de idade");
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("Empatou: " + this.getEmpates() + " lutas");
    }

    public void status()
    {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
}