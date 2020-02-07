using clientes.classes.menu;

namespace clientes.classes.tela
{
    public sealed class TelaUsuario : TelaBase
    {
        public void Mostrar()
        {
            var menu = new MenuUsuario();
            var usuario = new Usuario();

            while (true)
            {
                switch (menu.Mostrar())
                {
                    case (int)MenuBase.Opcoes.VOLTAR:
                        return;

                    case (int)MenuBase.Opcoes.CADASTRAR:

                        base.Cadastro(usuario);

                        break;

                    case (int)MenuBase.Opcoes.LISTAR:

                        base.Listagem(usuario);

                        break;

                    case (int)MenuBase.Opcoes.REMOVER:

                        base.Remocao(usuario);

                        break;

                    default:
                        break;
                }
            }
        }
    }
}