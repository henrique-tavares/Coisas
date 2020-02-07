using System;

namespace recursivo
{
    class Program
    {
        public static ulong Fatorial(uint n)
        {
            return (n > 1 ? n * Fatorial(n-1) : 1);
        }

        public static uint Bits(uint n)
        {
            return (n / 2 > 0 ? 1 + Bits(n/2) : 1);
        } 

        static void Main(string[] args)
        {
            Console.WriteLine(Fatorial(10));
            
            Console.WriteLine(Bits(0));
            Console.WriteLine(Bits(1));
            Console.WriteLine(Bits(10));
            Console.WriteLine(Bits(100));
            Console.WriteLine(Bits(1024));
        }
    }
}
