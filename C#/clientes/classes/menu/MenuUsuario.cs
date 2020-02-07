namespace clientes.classes.menu
{
    public class MenuUsuario : MenuBase
    {
        public override int Mostrar()
        {
            return base.Mostrar(
                "Tela de usuários",
                "Cadastrar usuário",
                "Listar usuários",
                "Remover usuário"
            );
        }
    }
}