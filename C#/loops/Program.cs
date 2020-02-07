using System;

namespace loops
{
    class Program
    {
        static void Main(string[] args)
        {
            var i1 = 0;

            Console.WriteLine("While:");
            while (i1 < 10)
            {
                if (i1 % 2 == 1)
                {
                    i1++;
                    continue;
                }
                Console.WriteLine($"i1: {i1}");
                i1++;
            }
            Console.WriteLine();

            var i2 = 10;

            Console.WriteLine("Do/While:");
            do
            {
                Console.WriteLine($"i2: {i2}");

                if (i2 == 18)
                {
                    break;
                }

                i2++;

            } while (i2 < 20);
            Console.WriteLine();

            Console.WriteLine("For:");
            for (int i3 = 20; i3 < 30; i3++)
            {
                if (i3 % 2 == 0)
                {
                    continue;
                }
                Console.WriteLine($"i3: {i3}");
            }
            Console.WriteLine();

            int[] arr = { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 };

            Console.WriteLine("ForEach:");
            foreach (int i4 in arr)
            {
                Console.WriteLine($"i4: {i4}");
            }
            Console.WriteLine();
        }
    }
}
