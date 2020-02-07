using System;

namespace clientes.classes.menu
{
    public abstract class MenuBase
    {
        public enum Opcoes
        {
            VOLTAR,
            CADASTRAR,
            LISTAR,
            REMOVER
        }

        /// <summary>
        /// Função para mostrar na tela um menu com opções personalizadas
        /// </summary>
        /// <param name="titulo">String referente ao título do menu</param>
        /// <param name="op1">String referente à opção de cadastro</param>
        /// <param name="op2">String referente à opção de listagem</param>
        /// <param name="op3">String referente à opção de remoção</param>
        /// <returns>O número opção escolhida</returns>
        protected int Mostrar(string titulo, string op1, string op2, string op3)
        {
            Console.Clear();

            string value = $"\n\t{titulo}\n";
            Console.WriteLine(value);

            Console.WriteLine("\t0 - Voltar");
            Console.WriteLine($"\t1 - {op1}");
            Console.WriteLine($"\t2 - {op2}");
            Console.WriteLine($"\t3 - {op3}\n");

            Console.Write("\tDigite uma opção: ");

            var op = Console.ReadLine();

            Console.Clear();

            return int.Parse(op);
        }

        public abstract int Mostrar();
    }
}