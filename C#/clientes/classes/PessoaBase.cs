using System;
using System.Collections.Generic;
using System.IO;
using componentes;

namespace clientes.classes
{
    public abstract class PessoaBase : IPessoa
    {
        private string _nome;
        private string _telefone;
        private string _cpf;

        public virtual string Nome { get => _nome; set => _nome = value; }
        public virtual string Telefone { get => _telefone; set => _telefone = value; }
        public virtual string CPF { get => _cpf; set => _cpf = value; }

        public PessoaBase(string nome, string telefone, string cpf)
        {
            this.Nome = nome;
            this.Telefone = telefone;
            this.CPF = cpf;
        }

        public PessoaBase() { }

        public abstract string DbPath();

        public virtual List<IPessoa> Listar()
        {
            var dados = new List<IPessoa>();

            using (StreamReader dataBase = new StreamReader(this.DbPath()))
            {
                string linha;
                string[] campos;

                while ((linha = dataBase.ReadLine()) != null)
                {
                    campos = linha.Split(';');

                    var p = (IPessoa)Activator.CreateInstance(this.GetType());

                    p.Nome = campos[0];
                    p.Telefone = campos[1];
                    p.CPF = campos[2];

                    dados.Add(p);
                }
            }

            return dados;
        }

        public virtual void Cadastrar()
        {
            try
            {
                if (ValidacaoCPF.Validar(this.CPF))
                {
                    Console.WriteLine("\nCPF válido!");

                    using (StreamWriter dataBase = new StreamWriter(path: this.DbPath(), append: true))
                    {
                        dataBase.WriteLine($"{this.Nome};{this.Telefone};{this.CPF}");
                    }
                }
                else
                {
                    Console.WriteLine("\nCPF inválido!");

                    if (Ferramentas.Question("Deseja cadastrar mesmo assim ?"))
                    {
                        using (StreamWriter dataBase = new StreamWriter(path: this.DbPath(), append: true))
                        {
                            dataBase.WriteLine($"{this.Nome};{this.Telefone};{this.CPF}");
                        }
                    }
                }
            }
            catch (Exception)
            {
                Console.WriteLine("\nFormato de CPF inválido!");
                Console.WriteLine("\nEx: xxx.xxx.xxx-xx");
            }
        }

        public virtual bool Remover(string cpf)
        {
            var dados = this.Listar();
            var status = false;

            using (StreamWriter dataBase = new StreamWriter(path: this.DbPath(), append: false))
            {
                foreach (var pessoa in dados)
                {
                    if (pessoa.CPF.Equals(cpf))
                    {
                        status = true;
                        continue;
                    }

                    dataBase.WriteLine($"{pessoa.Nome};{pessoa.Telefone};{pessoa.CPF}");

                }
            }

            return status;
        }
    }
}