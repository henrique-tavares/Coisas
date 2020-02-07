using System.Collections.Generic;

namespace clientes.classes
{
    public interface IPessoa
    {
        string Nome { get; set; }
        string Telefone { get; set; }
        string CPF { get; set; }

        List<IPessoa> Listar();
        void Cadastrar();
        bool Remover(string cpf);
    }
}