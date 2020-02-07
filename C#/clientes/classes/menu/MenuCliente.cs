namespace clientes.classes.menu
{
    public class MenuCliente : MenuBase
    {
        public override int Mostrar()
        {
            return base.Mostrar(
                "Tela de clientes",
                "Cadastrar cliente",
                "Listar clientes",
                "Remover cliente"
            );
        }
    }
}