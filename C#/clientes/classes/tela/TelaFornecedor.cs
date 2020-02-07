using System;
using clientes.classes.menu;

namespace clientes.classes.tela
{
    public sealed class TelaFornecedor : TelaBase
    {
        public void Mostrar()
        {
            var menu = new MenuFornecedor();
            var fornecedor = new Fornecedor();

            while (true)
            {
                switch (menu.Mostrar())
                {
                    case (int)MenuBase.Opcoes.VOLTAR:
                        return;

                    case (int)MenuBase.Opcoes.CADASTRAR:

                        this.Cadastro(fornecedor);

                        break;

                    case (int)MenuBase.Opcoes.LISTAR:

                        this.Listagem(fornecedor);

                        break;

                    case (int)MenuBase.Opcoes.REMOVER:

                        this.Remocao(fornecedor);

                        break;

                    default:
                        break;
                }
            }
        }

        public void Cadastro(Fornecedor f)
        {
            Console.Write("\nDigite o nome: ");
            f.Nome = Console.ReadLine();

            Console.Write("Digite o telefone: ");
            f.Telefone = Console.ReadLine();

            Console.Write("Digite o CNPJ: ");
            f.CNPJ = Console.ReadLine();

            f.Cadastrar();

            Console.Write("\nDigite qualquer tecla para continuar: ");
            _ = Console.ReadKey();
        }

        public void Listagem(Fornecedor f)
        {
            Console.WriteLine();

            foreach (Fornecedor fornecedor in f.Listar())
            {
                Console.WriteLine($"Nome: {fornecedor.Nome}\nTelefone: {fornecedor.Telefone}\nCNPJ: {fornecedor.CNPJ}\n");
            }

            Console.Write("\nDigite qualquer tecla para continuar: ");
            _ = Console.ReadKey();
        }

        public void Remocao(Fornecedor f)
        {
            Console.Write("\nDigite o CNPJ: ");

            if (f.Remover(Console.ReadLine()))
            {
                try
                {
                    Console.WriteLine($"\n{f.GetType().ToString().Split('.')[2]} removido");
                }
                catch (Exception)
                {
                    Console.WriteLine($"\n{f.GetType()} removido");
                }
            }
            else
            {
                try
                {
                    Console.WriteLine($"\n{f.GetType().ToString().Split('.')[2]} não encontrado");
                }
                catch (Exception)
                {
                    Console.WriteLine($"\n{f.GetType()} não encontrado");
                }
            }

            Console.Write("\nDigite qualquer tecla para continuar: ");
            _ = Console.ReadKey();
        }
    }
}