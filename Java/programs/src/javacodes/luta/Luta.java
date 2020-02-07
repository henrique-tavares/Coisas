package javacodes.luta;

import java.util.Random;

public class Luta
{
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;


    public Lutador getdesafiado() 
    {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) 
    {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() 
    {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) 
    {
        this.desafiante = desafiante;
    }

    public int getRounds() 
    {
        return this.rounds;
    }

    public void setRounds(int rounds) 
    {
        this.rounds = rounds;
    }

    public boolean isAprovada() 
    {
        return this.aprovada;
    }

    public boolean getAprovada() 
    {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) 
    {
        this.aprovada = aprovada;
    }

    public Luta()
    {
        this.desafiante = null;
        this.desafiado = null;
        this.aprovada = false;
    }

    public void marcarLuta(Lutador l1, Lutador l2, int rounds)
    {
        if (l1.equals(l2))
        {
            System.out.println("Não é possível um lutador lutar consigo mesmo.");
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
        
        else if (l1.getCategoria().equals("Inválido") || l2.getCategoria().equals("Inválido"))
        {
            System.out.println("Não é possível um lutador de categoria inválida lutar.");
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
        
        else if (!l1.getCategoria().equals(l2.getCategoria()))
        {
            System.out.println("Não é possível lutadores de categorias diferentes lutarem entre si.");
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
        
        else if (rounds < 1)
        {
            System.out.println("Uma luta precisa ter ao menos 1 round");
            this.setDesafiante(null);
            this.setDesafiado(null);
        }

        else
        {
            this.setRounds(rounds);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            this.setAprovada(true);
            System.out.println("Luta aprovada!");
        }

        System.out.println("");
    }

    public void lutar()
    {
        if (this.isAprovada())
        {
            this.desafiante.apresentar();
            this.desafiado.apresentar();
            System.out.println("");
            
            Random aleatorio = new Random();
            int l1Vit = 0, l2Vit = 0, round;

            System.out.println("");
            for (int i = 0; i < this.getRounds(); i++)
            {
                round = aleatorio.nextInt(3);
                switch (round)
                {
                    case 0: // Empate
                    System.out.println("O " + (i+1) + "º Round empatou!");
                    break;
                
                case 1: // Desafiante ganhou
                    System.out.println(this.desafiante.getNome() + " Ganhou o " + (i+1) + "º Round!");
                    l1Vit++;
                    break;
                
                case 2: // Desafiado ganhou
                    System.out.println(this.desafiado.getNome() + " Ganhou o " + (i+1) + "º Round!");
                    l2Vit++;
                    break; 
                }
            }

            System.out.println("");

            if (l1Vit == l2Vit)
            {
                System.out.println("Empatou!");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
            }
            else if (l1Vit > l2Vit)
            {
                System.out.println("O desafiante " + this.desafiante.getNome() + " Ganhou!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            }
            else if (l2Vit > l1Vit)
            {
                System.out.println("O desafiado " + this.desafiado.getNome() + "Ganhou!");
                this.desafiante.perderLuta();
                this.desafiado.ganharLuta();
            }
        }

        else System.out.println("Luta não aprovada.");

        System.out.println("");
    }

}