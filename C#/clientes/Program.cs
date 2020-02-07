using System;
using clientes.classes.tela;

namespace clientes
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            TelaPrincipal.Mostrar();
        }
    }

    public class TelaPrincipal
    {
        public static void Mostrar()
        {
            var menu = new MenuPrincipal();
            var telaCliente = new TelaCliente();
            var telaUsuario = new TelaUsuario();
            var telaFornecedor = new TelaFornecedor();

            while (true)
            {
                switch (menu.Mostrar())
                {
                    case (int)MenuPrincipal.Opcoes.SAIDA_PROGRAMA:
                        return;

                    case (int)MenuPrincipal.Opcoes.TELA_DE_CLIENTES:

                        telaCliente.Mostrar();

                        break;

                    case (int)MenuPrincipal.Opcoes.TELA_DE_USUARIOS:

                        telaUsuario.Mostrar();

                        break;

                    case (int)MenuPrincipal.Opcoes.TELA_DE_FORNECEDORES:

                        telaFornecedor.Mostrar();

                        break;

                    default:
                        break;

                }
            }
        }
    }

    public class MenuPrincipal
    {
        public enum Opcoes
        {
            SAIDA_PROGRAMA,
            TELA_DE_CLIENTES,
            TELA_DE_USUARIOS,
            TELA_DE_FORNECEDORES
        }

        public int Mostrar()
        {
            Console.Clear();

            Console.WriteLine("\n\tTela principal\n");

            Console.WriteLine("\t0 - Sair");
            Console.WriteLine("\t1 - Tela de clientes");
            Console.WriteLine("\t2 - Tela de usuários");
            Console.WriteLine("\t3 - Tela de fornecedores\n");

            Console.Write("\tDigite uma opção: ");

            var op = Console.ReadLine();

            Console.Clear();

            return int.Parse(op);
        }
    }
}
