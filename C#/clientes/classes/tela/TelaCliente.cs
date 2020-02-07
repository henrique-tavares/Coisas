using clientes.classes.menu;

namespace clientes.classes.tela
{
    public sealed class TelaCliente : TelaBase
    {
        public void Mostrar()
        {
            var menu = new MenuCliente();
            var cliente = new Cliente();

            while (true)
            {
                switch (menu.Mostrar())
                {
                    case (int)MenuBase.Opcoes.VOLTAR:
                        return;

                    case (int)MenuBase.Opcoes.CADASTRAR:

                        base.Cadastro(cliente);

                        break;

                    case (int)MenuBase.Opcoes.LISTAR:

                        base.Listagem(cliente);

                        break;

                    case (int)MenuBase.Opcoes.REMOVER:

                        base.Remocao(cliente);

                        break;

                    default:
                        break;
                }
            }
        }
    }
}