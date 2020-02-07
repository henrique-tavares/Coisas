using System;
using System.Collections.Generic;

namespace componentes
{
    public class ValidacaoCNPJ
    {
        /// <summary>
        /// Função auxiliar para transformar a string <paramref name="cnpj" /> em números
        /// </summary>
        /// <param name="cnpj">xx.xxx.xxx/xxxx-xx</param>
        /// <returns>Um vetor de listas de ineiros</returns>
        internal static List<int>[] Handle(string cnpj)
        {
            try
            {
                var campos = cnpj.Trim().Split('-');

                var digitos = new List<int>();
                var verificadoes = new List<int>();

                foreach (var i in campos[0])
                {
                    if (i.Equals('.') || i.Equals('/')) continue;

                    digitos.Add(int.Parse(i.ToString()));
                }

                foreach (var i in campos[1])
                {
                    verificadoes.Add(int.Parse(i.ToString()));
                }

                List<int>[] CNPJ = new List<int>[2] {
                    digitos,
                    verificadoes
                };

                if (!(CNPJ[0].Count == 12 && CNPJ[1].Count == 2))
                {
                    throw new Exception();
                }

                return CNPJ;
            }
            catch (Exception)
            {
                throw;
            }
        }

        /// <summary>
        /// Função para validar <paramref name="cnpj" />
        /// </summary>
        /// <param name="cnpj"></param>
        /// <returns>true caso o <paramref name="cnpj" /> seja válido</returns>
        public static bool Validar(string cnpj)
        {
            List<int>[] CNPJ = Handle(cnpj);

            var result1 = 0;
            var result2 = 0;

            for (int i = 0, j = 5; i < 12; i++, j--)
            {
                if (j == 1) j = 9;

                result1 += j * CNPJ[0][i];
            }

            for (int i = 0, j = 6; i < 13; i++, j--)
            {
                if (j == 1) j = 9;

                if (i == 12)
                {
                    result2 += j * CNPJ[1][0];
                }

                else
                {
                    result2 += j * CNPJ[0][i];
                }
            }

            Console.WriteLine(result1 + " " + result2);

            result1 = (result1 % 11 < 2) ? 0 : 11 - (result1 % 11);
            result2 = (result2 % 11 < 2) ? 0 : 11 - (result2 % 11);

            Console.WriteLine(result1 + " " + CNPJ[1][0]);
            Console.WriteLine(result2 + " " + CNPJ[1][1]);

            return ((result1 == CNPJ[1][0]) && (result2 == CNPJ[1][1])) ? true : false;
        }
    }
}