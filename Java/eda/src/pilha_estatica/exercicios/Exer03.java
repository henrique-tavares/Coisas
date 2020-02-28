package pilha_estatica.exercicios;

import pilha_estatica.Pilha;

public class Exer03
{
    private static class Livro
    {
        private String nome;
        private int isbn;
        private int anoLancamento;
        private String autor;

        public Livro(String nome, int isbn, int anoLancamento, String autor)
        {
            this.nome = nome;
            this.isbn = isbn;
            this.anoLancamento = anoLancamento;
            this.autor = autor;
        }

        @Override
        public String toString()
        {
            return (
                "Nome: " + this.nome + "\n" +
                "Autor: " + this.autor + "\n" +
                "Ano de lançamento: " + this.anoLancamento + "\n" +
                "Isbn: " + this.isbn + "\n"
            );
        }
    }

    public static void main(String[] args)
    {
        Pilha<Livro> livros = new Pilha<>(20);
        
        System.out.println("\nPilha de livros criada, pilha está vazia? " + livros.vazio());
        
        System.out.println("\nEmpilhando livros na pilha:");
        
        livros.empilha(new Livro("corsinha em marte", 45687453, 2019, "zerbit"));
        livros.empilha(new Livro("El pitchula", 45632421, 2019, "O Coronga"));
        livros.empilha(new Livro("livro", 1235768, 2000, "Mestre dos livros"));
        livros.empilha(new Livro("chat", 4536589, 2013, "twitch"));
        livros.empilha(new Livro("Fiot", 879654, 2017, "Felos"));
        livros.empilha(new Livro("A biografia do alienpls", 1235768, 2000, "chat"));
        
        System.out.println(livros.tamanho() + " livros foram empilhados:");
        System.out.println(livros);
        
        System.out.println("\nPilha de livros criada, pilha está vazia? " + livros.vazio());

        System.out.println("\nDesempilhando livros na pilha");

        while (!livros.vazio())
        {
            System.out.println("\nDesempilhando livro:\n" + livros.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia? " + livros.vazio());
    }
}