package javacodes.publicacao;

import javacodes.pessoa.*;

public final class Leitor extends Pessoa
{
    /**
     * 
     * @param nome Nome do Leitor
     * @param idade Idade do leitor
     * @param sexo Sexo do leitor: Sexo. (masculino, feminino ou outro)
     */
    public Leitor(String nome, int idade, Sexo sexo)
    {
        super(nome, idade, sexo);
    }
}