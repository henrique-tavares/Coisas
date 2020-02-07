package javacodes.publicacao;


public class Livro implements Publicacao
{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Leitor leitor;
    
    
    public String getTitulo() 
    {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    
    public String getAutor() 
    {
        return this.autor;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public int getTotPaginas() 
    {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) 
    {
        this.totPaginas = totPaginas;
    }
    
    public int getPagAtual() 
    {
        return this.pagAtual;
    }
    
    public void setPagAtual(int pagAtual) 
    {
        if (pagAtual < 1) this.pagAtual = 1;
        
        else if (pagAtual > this.totPaginas) this.pagAtual = this.totPaginas;
        
        else this.pagAtual = pagAtual;
    }
    
    public boolean isAberto() 
    {
        return this.aberto;
    }

    
    public void setAberto(boolean aberto) 
    {
        this.aberto = aberto;
    }
    
    public Leitor getLeitor() 
    {
        return this.leitor;
    }
    
    public void setLeitor(Leitor leitor) 
    {
        this.leitor = leitor;
    }
    
    /**
     * 
     * @param titulo Título do livro
     * @param autor Autor do livro
     * @param totPaginas Total de páginas do livro
     * @param pagAtual Página onde o leitor atualmente está
     * @param aberto Diz se o livro está aberto ou não
     * @param leitor Leitor do livro
     */
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Leitor leitor)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }
    
    /**
     * 
     * @return String contendo informaçoes sobre o livro
     */
    @Override
    public String toString()
    {
        return ("\n### --- Detalhes --- ###" +
                "\nTítulo: " + this.getTitulo() +
                "\nAutor: " + this.getAutor() +
                "\nTotal de páginas: " + this.getTotPaginas() +
                "\nPágina atual: " + this.getPagAtual() +
                "\nAberto? " + this.isAberto() +
                "\nLeitor: " + this.leitor.getNome() +
                "\n### ---------------- ###");
    }
    
    @Override
    public void abrir()
    {
        if (!this.isAberto())
        {
            System.out.println("\nAbrindo o livro: " + this.getTitulo());
            this.setAberto(true);
        }
        else if (this.isAberto())
        {
            System.out.println("\nO livro já está aberto.");
        }
    }

    @Override
    public void fechar()
    {
        if (this.isAberto())
        {
            System.out.println("\nFechando o livro: " + this.getTitulo());
            this.setAberto(false);
        }
        else if (!this.isAberto())
        {
            System.out.println("\nO livro já está fechado.");
        }
    }

    @Override
    public void folhear(int pag)
    {
        if (this.isAberto())
        {
            if (pag < 1) pag = 1;
            
            else if (pag > this.totPaginas) pag = this.totPaginas;

            System.out.println("\nFolheando o livro até a página " + pag);
            this.setPagAtual(pag);
        }
        else System.out.println("\nNão é possível folhear um livro fechado.");

    }

    @Override
    public void avancarPag()
    {
        if (this.isAberto())
        {
            if (this.pagAtual < this.totPaginas)
            {
                this.pagAtual++;
                System.out.println("\nAvançando para a página " + this.getPagAtual());
            }
            else
            {
                System.out.println("\n" + this.leitor.getNome() + " Já chegou ao final do livro.");
            }
        }
        else System.out.println("\nNão é possível avançar a página em um livro fechado.");

    }

    @Override
    public void voltarPag()
    {
        if (this.isAberto())
        {
            if (this.pagAtual > 1)
            {
                this.pagAtual--;
                System.out.println("\nVoltando para a página " + this.getPagAtual());
            }
            else
            {
                System.out.println("\n" + this.leitor.getNome() + " Já está no início do livro.");
            }
        }
        else System.out.println("\nNão é possível voltar a página em um livro fechado.");

    }
}