package javacodes.agenda;

import java.util.HashMap;

public class Agenda
{
    HashMap<Integer, Contato> contatos;

    public Agenda()
    {
        this.contatos = new HashMap<>();
    }

    /**
     * 
     * @param contato a ser adicionado
     * @return id do contato adicionado
     */
    public int addContato(Contato contato)
    {
        contatos.put(contato.getId(), contato);

        return contato.getId();
    }

    /**
     * 
     * @param id do contato a ser consultado
     * @throws ContatoNaoExisteException
     */
    public void consultarContato(int id) throws ContatoNaoExisteException
    {
        Contato contato = contatos.get(id);

        if (contato == null) throw new ContatoNaoExisteException(id);

        System.out.println("\n" + contato.toString() + "\n");
    }
}