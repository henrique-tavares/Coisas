import javacodes.animal.*;
import javacodes.caneta.*;
import javacodes.contabanco.*;
import javacodes.controle.*;
import javacodes.luta.*;
import javacodes.pessoa.*;
import javacodes.publicacao.*;
import javacodes.video.*;
import javacodes.recursivo.*;
import javacodes.imposto_de_renda.*;
import javacodes.zoologico.*;
import javacodes.figuras_geometricas.*;

@SuppressWarnings("unused")
public class Teste
{
    public static void main(String[] args)
    {
        Quadrado q = new Quadrado("Azul-escuro", 11);

        Triangulo t = new Triangulo("Vermelho", 7.5, 13.6);

        Circulo cr = new Circulo("Branco", 9);

        Cubo cu = new Cubo("Rosa", 21.5);

        Cilindro cl = new Cilindro("Bege", 3, 10.75);

        Piramide p = new Piramide("Marrom", 51, 130);

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];

        figuras[0] = q;
        figuras[1] = t;
        figuras[2] = cr;
        figuras[3] = cu;
        figuras[4] = cl;
        figuras[5] = p;

        for (FiguraGeometrica figura : figuras)
        {
            if (figura instanceof Figura2D)
            {
                System.out.println("Nome: " + figura.getNome() + "\nÁrea: " + ((Figura2D) figura).calcularArea() + "\n");
            }

            else if (figura instanceof Figura3D)
            {
                System.out.println("Nome: " + figura.getNome() + "\nVolume: " + ((Figura3D) figura).calcularVolume() + "\n");
            }
        }
    }
}