using System;
using System.Collections.Generic;

namespace collections
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = new string[10];

            var ls = new List<string>();

            s[0] = "opa";

            ls.Add("alo");
            ls.Add("El Pichula");

            Console.WriteLine(s[0]);

            Console.WriteLine(ls[0] + ls[1]);
        }
    }
}
