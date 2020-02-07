package app;

import javacodes.caneta.*;
import javacodes.contabanco.*;
import javacodes.controle.*;
import javacodes.luta.*;
import javacodes.pessoa.*;
import javacodes.publicacao.*;
import javacodes.video.*;

@SuppressWarnings("unused")
public class App
{
    public static void main(String[] args)
    {    
        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Henrique", "M", 7, "neptune076");

        g[1] = new Gafanhoto("Darla", "F", 19, "darlinha");
        
        Video v = new Video("Chika Dance 10 hours version");

        Visualizacao vis[] = new Visualizacao[2];

        vis[0] = new Visualizacao(g[0], v);
        vis[0].avaliar();
        vis[0].avaliar(7);

        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[1], v);
        vis[1].avaliar(4);


        // System.out.println(g[0].toString());

        System.out.println(vis[1].toString());    
    }
}