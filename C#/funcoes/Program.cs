using System;

namespace funcoes
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i <= 100; i+=13)
            {
                if (i == 0) continue;
                
                Tabuada(i);
            }

            MostraNaTela(3.14);
            MostraNaTela("aAa");
        }

        public static void Tabuada(int n)
        {
            Console.WriteLine("--------------------------");
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine($"{n} x {i} = {n * i}");
            }
            Console.WriteLine("--------------------------");
        }

        public static void MostraNaTela(object p)
        {
            Console.WriteLine(p);
        }
    }
}
