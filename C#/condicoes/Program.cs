using System;

namespace condicoes
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("a: ");
            var a = int.Parse(Console.ReadLine());

            if (a > 0 && a < 10)
            {
                Console.WriteLine("Entrou no if");
            }

            else if (a == 20 || a >= 50)
            {
                Console.WriteLine("Entrou no else if");
            }

            else
            {
                Console.WriteLine("Entrou no else");
            }

            switch (a)
            {
                case 10:
                    Console.WriteLine("Case 1");
                    break;
                
                case 11:
                    Console.WriteLine("Case 2");
                    break;
                
                case 12:
                    Console.WriteLine("Case 3");
                    break;

                default:
                    Console.WriteLine("default");
                    break;
            }

            var s = (a < 0 ? 'n' : 'p');

            Console.WriteLine(s);
        }
    }
}
