using System;

namespace programa_funcional.utils
{
    public class Tabuada
    {
        public static void Calcular(double n)
        {
            Console.WriteLine("----------------------------");
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine($"{n} x {i} = {n * i}");
            }
            Console.WriteLine("----------------------------");
        }
    }
}