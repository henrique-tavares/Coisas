using System;

namespace componentes
{
    public class Ferramentas
    {
        /// <summary>
        /// Função que implementa uma pergunta de sim ou não
        /// </summary>
        /// <param name="msg">Pergunta</param>
        /// <returns>true se a resposta for sim, ou false se for não</returns>
        public static bool Question(string msg)
        {
            while (true)
            {
                Console.Write("\n" + msg + " [S/N]: ");

                var op = Console.ReadLine().Trim().ToUpper();

                if (op.Equals("S")) return true;

                else if (op.Equals("N")) return false;
            }
        }
    }
}
