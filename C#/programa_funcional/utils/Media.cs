using System;

namespace programa_funcional.utils
{
    public class Media
    {
        public static double Calcular(uint n)
        {
            var media = 0.0;

            Console.WriteLine($"Digite os {n} números abaixo\n");

            for (int i = 0; i < n; i++)
            {
                Console.Write($"{i+1}º: ");
                media += double.Parse(Console.ReadLine());
            }

            Console.WriteLine();

            return media / n;
        }
    }
}