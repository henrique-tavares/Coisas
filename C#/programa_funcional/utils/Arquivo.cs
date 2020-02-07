using System;
using System.IO;

namespace programa_funcional.utils
{
    public class Arquivo
    {
        public static void LeArquivoTxt(string arq)
        {
            if (File.Exists(arq))
            {
                using (StreamReader arquivo = File.OpenText(arq))
                {
                    string linha;

                    while ((linha = arquivo.ReadLine()) != null)
                    {
                        Console.WriteLine(linha);
                    }
                }
            }
        }
    }
}