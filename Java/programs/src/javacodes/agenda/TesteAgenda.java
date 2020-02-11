package javacodes.agenda;

import java.util.Scanner;

public class TesteAgenda
{
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
        Agenda agenda = new Agenda();
        int id;

        while (true)
        {
            switch (menu())
            {
                case 0:
                    teclado.close();
                    System.exit(0);

                case 1:
                    System.out.println("\n" + "--------------------------------------------------------" + "\n");
                    
                    System.out.print("Nome: ");
                    String nome = teclado.next();

                    System.out.print("Telefone: ");
                    String telefone = teclado.next();

                    id = agenda.addContato(new Contato(nome, telefone));

                    System.out.println("\nContato adicionado com id: " + id);

                    break;
                
                case 2:
                    System.out.println("\n" + "--------------------------------------------------------" + "\n");

                    System.out.print("Id: ");
                    id = teclado.nextInt();

                    try
                    {
                        agenda.consultarContato(id);
                    }
                    catch (ContatoNaoExisteException e)
                    {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }

                    break;
                
                default:
                    break;
            }
        }
    }

    public static int menu()
    {
        System.out.println("\n" + "--------------------------------------------------------");
        System.out.println("\tAgenda\n");
        System.out.println("\t0 - Sair");
        System.out.println("\t1 - Adicionar contato");
        System.out.println("\t2 - Consultar contato");
        System.out.print("\n\tDigite uma opção: ");

        return teclado.nextInt();
    }
}