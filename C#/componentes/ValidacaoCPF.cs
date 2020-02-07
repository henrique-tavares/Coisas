using System;
using System.Collections.Generic;

namespace componentes
{
    public class ValidacaoCPF
    {
        /// <summary>
        /// Função auxiliar para transformar a string <paramref name="cpf" /> em números
        /// </summary>
        /// <param name="cpf">xxx.xxx.xxx-xx</param>
        /// <returns>Um vetor de listas de ineiros</returns>
        internal static List<int>[] Handle(string cpf)
        {
            try
            {
                var campos = cpf.Trim().Split('-');

                var digitos = new List<int>();
                var verificadoes = new List<int>();

                foreach (var i in campos[0])
                {
                    if (i.Equals('.')) continue;

                    digitos.Add(int.Parse(i.ToString()));
                }

                foreach (var i in campos[1])
                {
                    verificadoes.Add(int.Parse(i.ToString()));
                }

                List<int>[] CPF = new List<int>[2]
                {
                    digitos,
                    verificadoes
                };

                if (!(CPF[0].Count == 9 && CPF[1].Count == 2))
                {
                    throw new Exception();
                }

                return CPF;
            }
            catch (Exception)
            {
                throw;
            }
        }

        /// <summary>
        /// Função validadora de cpf
        /// </summary>
        /// <param name="cpf">xxx.xxx.xxx-xx</param>
        /// <returns>true caso o <paramref name="cpf" /> seja válido</returns>
        public static bool Validar(string cpf)
        {
            List<int>[] CPF = Handle(cpf);

            var test = true;

            foreach (var campo in CPF)
            {
                foreach (var num in campo)
                {
                    if (CPF[0][0] != num) test = false;
                }
            }

            if (test) return false;

            var result1 = 0;
            var result2 = 0;

            for (int i = 0, j = 10; i < 9; i++, j--)
            {
                result1 += j * CPF[0][i];
            }

            for (int i = 0, j = 11; i < 10; i++, j--)
            {
                if (i == 9)
                {
                    result2 += j * CPF[1][0];
                }

                else
                {
                    result2 += j * CPF[0][i];
                }
            }

            // Console.WriteLine(result1 + " " + result2);

            result1 = ((result1 * 10) % 11 == 10) ? 0 : (result1 * 10) % 11;
            result2 = ((result2 * 10) % 11 == 10) ? 0 : (result2 * 10) % 11;

            // Console.WriteLine(result1 + " " + CPF[1][0]);
            // Console.WriteLine(result2 + " " + CPF[1][1]);

            return ((result1 == CPF[1][0]) && (result2 == CPF[1][1])) ? true : false;
        }
    }
}