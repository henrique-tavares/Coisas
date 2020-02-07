using System;

namespace programa_funcional.utils
{
    public class Menu
    {
        public static int Programa()
        {
            Console.WriteLine("\tPrograma funcional\n");

            Console.WriteLine("\t0 - Sair");
            Console.WriteLine("\t1 - Ler arquivo txt");
            Console.WriteLine("\t2 - Tabuada");
            Console.WriteLine("\t3 - Calcular média");

            Console.Write("\tDigite uma opção: ");

            return int.Parse(Console.ReadLine());
        }
    }
}