using System;
using programa_funcional.utils;

namespace programa_funcional
{
    class Program
    {

        static void Main(string[] args)
        {
            while (true)
            {
                Console.Clear();

                var op = Menu.Programa();

                Console.Clear();

                switch (op)
                {
                    case (int)Opcoes.SAIDA_PROGRAMA:
                        return;

                    case (int)Opcoes.LE_ARQUIVO_TXT:

                        Console.Write("Digite o caminho completo do arquivo: ");
                        var arq = Console.ReadLine();
                        Console.WriteLine();

                        Arquivo.LeArquivoTxt(arq);

                        Console.Write("\nDigite qualquer tecla para continuar: ");
                        _ = Console.ReadKey();

                        break;

                    case (int)Opcoes.TABUADA:

                        Console.Write("Digite um número: ");
                        var num = double.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Tabuada.Calcular(num);

                        Console.Write("\nDigite qualquer tecla para continuar: ");
                        _ = Console.ReadKey();

                        break;

                    case (int)Opcoes.CALCULAR_MEDIA:

                        Console.Write("Digite a quantidade de números: ");
                        var n = uint.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Console.WriteLine(Media.Calcular(n));

                        Console.Write("\nDigite qualquer tecla para continuar: ");
                        _ = Console.ReadKey();

                        break;

                    default:
                        break;

                }
            }
        }
    }
}
