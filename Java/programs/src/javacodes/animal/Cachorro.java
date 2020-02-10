package javacodes.animal;

public final class Cachorro extends Lobo implements AnimalDomesticado, AnimalEstimacao
{

    @Override
    public void emitirSom()
    {
        System.out.println("Latiu!");
    }

    public void reagir(String frase)
    {
        if (frase.equals("Hora da comida") || frase.equals("Vamo passear"))
            System.out.println("Abanou o rabo e latiu!");

        else if (frase.equals("Vai pra casinha"))
            System.out.println("Rosnou!");
        
        else System.out.println("Abanou o rabo!");
    }

    public void reagir(int hora, int min)
    {
        if (hora < 12) System.out.println("Abanou o rabo!");

        else if (hora < 19) System.out.println("Abanou o rabo e latiu!");

        else System.out.println("Ignorou");
    }

    public void reagir(boolean dono)
    {
        if (dono) System.out.println("Abanou o rabo!");

        else System.out.println("Rosnou e latiu!");
    }

    public void reagir(int idade, double peso)
    {
        if (idade < 10)
        {
            if (peso < 10) System.out.println("Correu!");

            else System.out.println("Abanou o rabo e latiu!");
        }

        else
        {
            if (peso < 10) System.out.println("Abanou o rabo!");

            else System.out.println("Deitou!");
        }
    }

    @Override
    public void brincar()
    {
        System.out.println("O cachorro ficou mais feliz depois de brincar");
    }

    @Override
    public void levarPassear()
    {
        System.out.println("O cachorro ficou mais tranquilo depois de passear");
    }

    @Override
    public void levarVeterinario()
    {
        System.out.println("O cachorro foi no vetrinário");
    }

    /**
     * 
     * @param peso
     * @param idade
     * @param membros
     * @param corPelo
     */
    public Cachorro(double peso, int idade, int membros, String corPelo)
    {
        super(peso, idade, membros, corPelo);
    }
}