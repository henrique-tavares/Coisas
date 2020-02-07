namespace clientes.classes.menu
{
    public class MenuFornecedor : MenuBase
    {
        public override int Mostrar()
        {
            return base.Mostrar(
                "Tela de fornecedores",
                "Cadastrar fornecedor",
                "Listar fornecedor",
                "Remover fornecedor"
            );
        }
    }

}