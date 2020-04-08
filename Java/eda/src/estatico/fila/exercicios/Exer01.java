package estatico.fila.exercicios;

import estatico.fila.Fila;

public class Exer01
{
    private static class Documento
    {
        public String nome;
        public int folhas;

        public Documento(String nome, int folhas)
        {
            this.nome = nome;
            this.folhas = folhas;
        }
    }

    static Fila<Documento> fila = new Fila<>();

    public static void adicionarDocumento(Documento doc)
    {
        fila.enfileira(doc);
    }

    public static void imprimir()
    {
        if (fila.vazio())
        {
            return;
        }

        Documento doc = fila.desenfileira();

        System.out.println("\nDocumento: " + doc.nome);

        for (int i = 0; i < doc.folhas; i++)
        {
            System.out.println("Folha: " + (i + 1));

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        adicionarDocumento(new Documento("doc #1", 2));
        adicionarDocumento(new Documento("doc #2", 10));
        adicionarDocumento(new Documento("doc #3", 1));
        adicionarDocumento(new Documento("doc #4", 2));
        adicionarDocumento(new Documento("doc #5", 5));
        adicionarDocumento(new Documento("doc #6", 1));

        imprimir();
        imprimir();
        imprimir();
        imprimir();
        imprimir();
        imprimir();
    }
}