

// import javacodes.animal.*;
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

@SuppressWarnings("unused")
public class Teste
{
    public static void main(String[] args)
    {
        // PessoaFisica p1 = new PessoaFisica("Contribúnte 01", 1000, "583.358.456-62");

        // PessoaJuridica p2 = new PessoaJuridica("Contribúnte 02", 5000, "91.403.512/0001-54");

        // PessoaFisica p3 = new PessoaFisica("Contribúnte 03", 2000, "828.277.078-70");
        
        // PessoaJuridica p4 = new PessoaJuridica("Contribúnte 04", 3000, "35.434.693/0001-05");

        // PessoaFisica p5 = new PessoaFisica("Contribúnte 05", 3700, "547.653.548-90");

        // PessoaJuridica p6 = new PessoaJuridica("Contribúnte 06", 4000, "10.684.822/0001-92");

        // Contribuinte[] contribuintes = new Contribuinte[6];
        
        // contribuintes[0] = p1;
        // contribuintes[1] = p2;
        // contribuintes[2] = p3;
        // contribuintes[3] = p4;
        // contribuintes[4] = p5;
        // contribuintes[5] = p6;

        // for (Contribuinte contribuinte : contribuintes)
        // {
        //     System.out.println(contribuinte.toString());
        // }

        Mamifero m1 = new Mamifero("Camelo", 150, "Amarelo", "Terra", 2, "Cactus");

        Peixe p1 = new Peixe("Tubarão", 300, "Cinzento", "Mar", 1.5, "Barbatana e cauda");
        
        Mamifero m2 = new Mamifero("Urso-do-canadá", 180, "Vermelho", "Terra", 0.5, "Mel");

        Animal[] animais = new Animal[3];

        animais[0] = m1;
        animais[1] = p1;
        animais[2] = m2;

        System.out.println("\nZoo:");
        System.out.println("-----------------------------------");
        
        for (Animal animal : animais)
        {
            System.out.println(animal.toString());
            System.out.println("-----------------------------------");
        }
    }
}