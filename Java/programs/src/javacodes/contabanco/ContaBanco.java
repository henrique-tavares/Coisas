package javacodes.contabanco;

import javacodes.contabanco.exceptions.*;

public class ContaBanco
{
    // -------------------------------------------------|Atributos|-------------------------------------------------//
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean stauts;
    // -------------------------------------------------------------------------------------------------------------//

    // --------------------------------------------------|Métodos|--------------------------------------------------//
    public void abrirConta(String nome, String tipo)
    {
        if (this.stauts == true)
        {
            throw new ContaAbertaException("Erro! A conta já está abreta.");
        }

        if (!(tipo.equals("cc") || tipo.equals("cp")))
        {
            throw new IllegalArgumentException("Erro! Tipo de conta não existe.");
        }

        this.setTipo(tipo);
        this.setDono(nome);
        this.setNumConta(1000 + (int) (Math.random() * 8999));
        this.setStatus(true);

        switch (this.tipo)
        {
            case "cc":
                System.out.println("Conta corrente criada com sucesso! Sr. " + this.getDono());
                this.saldo = 50;
                break;

            case "cp":
                System.out.println("Conta poupança criada com sucesso! Sr. " + this.getDono());
                this.saldo = 150;
                break;
        }

        System.out.println("Número da conta: " + this.getNumConta());

    }

    public void fecharConta()
    {
        if (this.stauts == false)
        {
            throw new ContaFechadaException("Erro! A conta já está fechada.");
        }

        if (this.saldo > 0)
        {
            throw new IllegalStateException("Erro! Não foi possível fechar a conta com saldo existente.");
        }
        
        this.setStatus(false);
        switch (this.tipo)
        {
            case "cc":
                System.out.println("Conta corrente fechada com sucesso! Sr. " + this.getDono());
                break;

            case "cp":
                System.out.println("Conta poupança fechada com sucesso! Sr. " + this.getDono());
                break;
        }
        
    }

    public void depositar(double deposito)
    {
        if (this.stauts == false)
        {
            throw new ContaFechadaException("Erro! Não é possível depositar em uma conta fechada.");
        }

        if (deposito < 0)
        {
            throw new DepositoInvalidoException("Erro! Não é possível depositar um valor negativo.");
        }
        
        System.out.println("Depositado " + deposito + " reais com sucesso!");
        this.saldo += deposito;
        
    }

    public void sacar(double saque)
    {
        if (this.stauts == false)
        {
            throw new ContaFechadaException("Erro! Não é possível sacar em uma conta fechada.");
        }

        if (saque > saldo)
        {
            throw new SaqueInvalidoException("Erro! Não é possível sacar um valor maior que o seu saldo.");
        }

        if (saque < 0)
        {
            throw new SaqueInvalidoException("Erro! Não é possível sacar um valor negativo.");
        }
        
        System.out.println("Sacado " + saque + " reais com sucesso!");
        this.saldo -= saque;
        
    }

    public void pagarMensal()
    {
        if (this.stauts == false)
        {
            throw new ContaFechadaException("Erro! Não é possível pagar a mensalidade de uma conta fechada.");
        }
        
        switch (this.tipo)
        {
            case "cc":
                System.out.println("Taxa mensal de 12 reais paga com sucesso!");
                this.saldo -= 12;
                break;

            case "cp":
                System.out.println("Taxa mensal de 20 reais paga com sucesso!");
                this.saldo -= 20;
                break;
        }
        
    }
    // -------------------------------------------------------------------------------------------------------------//

    // ---------------------------------------|Getters, Setters e Constructor|--------------------------------------//
    public ContaBanco()
    {
        this.stauts = false;
    }

    public int getNumConta()
    {
        return this.numConta;
    }

    public void setNumConta(int i)
    {
        this.numConta = i;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setTipo(String s)
    {
        this.tipo = s;
    }

    public String getDono()
    {
        return this.dono;
    }

    public void setDono(String s)
    {
        this.dono = s;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public void setSaldo(double d)
    {
        this.saldo = d;
    }

    public boolean getStatus()
    {
        return this.stauts;
    }

    public void setStatus(boolean b)
    {
        this.stauts = b;
    }
    // -------------------------------------------------------------------------------------------------------------//
}