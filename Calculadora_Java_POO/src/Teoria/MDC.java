package Teoria;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class MDC
{
    public static void execute()
    {
        try
        {
            System.out.print("Digite o primeiro número: ");
            int valueA = Reader.rdInt();
            System.out.print("Digite o segundo número: ");
            int valueB = Reader.rdInt();

            valueA = Math.abs(valueA);
            valueB = Math.abs(valueB);

            while(valueB != 0)
            {
                int remainder = valueA % valueB;
                valueA = valueB;
                valueB = remainder;
            }

            System.out.println("= "+ valueA);
            Delay.sleep(1500);
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO+"Erro: Entrada Inválida!"+Color.RESET);
        }
    }
}
