namespace clientes.classes
{
    public sealed class Usuario : PessoaBase
    {
        public Usuario(string nome, string telefone, string cpf) : base(nome, telefone, cpf) { }

        public Usuario() : base() { }

        public override string DbPath()
        {
            return "/mnt/c/Users/rickt/Documents/GitHub/Coisas/C#/clientes/db/usuarios.csv";
        }
    }
}
