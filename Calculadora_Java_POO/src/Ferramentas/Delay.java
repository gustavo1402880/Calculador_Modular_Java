package Ferramentas;

public class Delay
{
    public static void sleep (int tempoMS)
    {
        try
        {
            Thread.sleep(tempoMS);
        }
        catch (Exception e)
        {
            System.out.println("Erro ao executar Delay "+e);
        }
    }
}
