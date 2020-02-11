package javacodes.classes_aninhadas;

public class Anonima
{
    private String texto = "aaaaaaaaaa";

    public void imprimeTexto()
    {
        System.out.println(texto);
    }

    public interface Texto
    {
        void imprimePalavra();
    }

    public static void main(String[] args)
    {
        Anonima a = new Anonima()
        {
            private String texto = "fjdlshkj";

            public void imprimeTexto()
            {
                System.out.println(texto);
            }
        };

        a.imprimeTexto();

        Texto t = new Texto()
        {
            @Override
            public void imprimePalavra()
            {
                System.out.println("fdksgjd");
            }
        };

        t.imprimePalavra();
    }
}