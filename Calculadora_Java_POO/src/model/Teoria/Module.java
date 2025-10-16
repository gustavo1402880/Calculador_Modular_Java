package model.Teoria;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class Module
{
    public static void execute()
    {
        try
        {
            System.out.print("Digite um número: ");
            double value = Reader.rdDouble();

            System.out.println("Abs("+value+") = "+Math.abs(value));
            Delay.sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO+"Erro: Entrada Inválida!"+Color.RESET);
        }
    }
}
