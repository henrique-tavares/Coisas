package javacodes.classes_aninhadas;

public class Externa01
{
    private String texto = "aaaaaaaaa";

    public class Interna01
    {
        private String texto = "eeeeeeeeeeee";

        public void imprimeTexto()
        {
            System.out.println(this.texto);

            System.out.println(Externa01.this.texto);
        }
    }

    public static class Interna02
    {
        private String texto = "iiiiiiiiiiiiiii";

        public void imprimeTexto()
        {
            System.out.println(this.texto);
        }
    }

    public static void main(String[] args)
    {
        Externa01 ext = new Externa01();
        Interna01 int01 = ext.new Interna01();
        Interna02 int02 = new Interna02();

        int01.imprimeTexto();
        int02.imprimeTexto();
    }
}