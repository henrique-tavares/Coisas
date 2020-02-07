using System;

namespace clientes.classes.tela
{
    public abstract class TelaBase
    {
        protected virtual void Cadastro(PessoaBase p)
        {
            Console.Write("\nDigite o nome: ");
            p.Nome = Console.ReadLine();

            Console.Write("Digite o telefone: ");
            p.Telefone = Console.ReadLine();

            Console.Write("Digite o CPF: ");
            p.CPF = Console.ReadLine();

            p.Cadastrar();

            Console.Write("\nDigite qualquer tecla para continuar: ");
            _ = Console.ReadKey();
        }

        protected virtual void Listagem(PessoaBase p)
        {
            Console.WriteLine();

            foreach (var pessoa in p.Listar())
            {
                Console.WriteLine($"Nome: {pessoa.Nome}\nTelefone: {pessoa.Telefone}\nCPF: {pessoa.CPF}\n");
            }

            Console.Write("\nDigite qualquer tecla para continuar: ");
            _ = Console.ReadKey();
        }

        protected virtual void Remocao(PessoaBase p)
        {
            Console.Write("\nDigite o CPF: ");

            if (p.Remover(Console.ReadLine()))
            {
                try
                {
                    Console.WriteLine($"\n{p.GetType().ToString().Split('.')[2]} removido");
                }
                catch (Exception)
                {
                    Console.WriteLine($"\n{p.GetType()} removido");
                }
            }
            else
            {
                try
                {
                    Console.WriteLine($"\n{p.GetType().ToString().Split('.')[2]} não encontrado");
                }
                catch (Exception)
                {
                    Console.WriteLine($"\n{p.GetType()} não encontrado");
                }
            }

            Console.Write("\nDigite qualquer tecla para continuar: ");
            _ = Console.ReadKey();
        }
    }
}