namespace clientes.classes
{
    public sealed class Cliente : PessoaBase
    {
        public Cliente(string nome, string telefone, string cpf) : base(nome, telefone, cpf) { }

        public Cliente() : base() { }

        public override string DbPath()
        {
            return "/mnt/c/Users/rickt/Documents/GitHub/Coisas/C#/clientes/db/clientes.csv";
        }
    }
}