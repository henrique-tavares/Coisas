using System;
using System.IO;
using System.Collections.Generic;
using componentes;

namespace clientes.classes
{
    public sealed class Fornecedor : PessoaBase
    {
        private string _cnpj;

        public string CNPJ { get => _cnpj; set => _cnpj = value; }

        public new readonly string CPF;

        public Fornecedor(string nome, string telefone, string cnpj) : base(nome, telefone, null)
        {
            this.CNPJ = cnpj;
        }

        public Fornecedor() { }

        public override string DbPath()
        {
            return "/mnt/c/Users/rickt/Documents/GitHub/Coisas/C#/clientes/db/fornecedor.csv";
        }

        public override void Cadastrar()
        {
            try
            {
                if (ValidacaoCNPJ.Validar(this.CNPJ))
                {
                    Console.WriteLine("\nCNPJ válido!");

                    using (StreamWriter dataBase = new StreamWriter(path: this.DbPath(), append: true))
                    {
                        dataBase.WriteLine($"{this.Nome};{this.Telefone};{this.CNPJ}");
                    }
                }
                else
                {
                    Console.WriteLine("\nCNPJ inválido!");

                    if (Ferramentas.Question("Deseja cadastrar mesmo assim ?"))
                    {
                        using (StreamWriter dataBase = new StreamWriter(path: this.DbPath(), append: true))
                        {
                            dataBase.WriteLine($"{this.Nome};{this.Telefone};{this.CNPJ}");
                        }
                    }
                }
            }
            catch (Exception)
            {
                Console.WriteLine("\nFormato de CNPJ inválido!");
                Console.WriteLine("\nEx: xx.xxx.xxx/xxxx-xx");
            }
        }

        public new List<Fornecedor> Listar()
        {
            var dados = new List<Fornecedor>();

            using (StreamReader dataBase = new StreamReader(this.DbPath()))
            {
                string linha;
                string[] campos;

                while ((linha = dataBase.ReadLine()) != null)
                {
                    campos = linha.Split(';');

                    dados.Add(new Fornecedor(campos[0], campos[1], campos[2]));
                }
            }

            return dados;
        }

        public override bool Remover(string cnpj)
        {
            var dados = this.Listar();
            var status = false;

            using (StreamWriter dataBase = new StreamWriter(path: this.DbPath(), append: false))
            {
                foreach (var fornecedor in dados)
                {
                    if (fornecedor.CNPJ.Equals(cnpj))
                    {
                        status = true;
                        continue;
                    }

                    dataBase.WriteLine($"{fornecedor.Nome};{fornecedor.Telefone};{fornecedor.CNPJ}");

                }
            }

            return status;
        }
    }
}