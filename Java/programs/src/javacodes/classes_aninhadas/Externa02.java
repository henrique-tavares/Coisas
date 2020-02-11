package javacodes.classes_aninhadas;

public class Externa02
{
    public void metodoClasseLocal()
    {
        final class Local
        {
            private String texto = "aaaaaaaaaaaa";

            public void imprimeTexto()
            {
                System.out.println(texto);
            }
        }

        Local local = new Local();

        local.imprimeTexto();
    }

    public static void main(String[] args)
    {
        Externa02 ext = new Externa02();

        ext.metodoClasseLocal();
    }
}