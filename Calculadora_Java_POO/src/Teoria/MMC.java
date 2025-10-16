package Teoria;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class MMC
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

            if(valueA == 0 || valueB == 0)
            {
                System.out.println("= "+0);
                return;
            }

            int num1 = valueA;
            int num2 = valueB;

            int remainder;
            while (num2 != 0)
            {
                remainder = num1 % num2;
                num1 = num2;
                num2 = remainder;
            }
            int mdc = num1;

            long mmc = ((long)valueA * valueB) / mdc;

            System.out.println("= "+mmc);
            Delay.sleep(1500);
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO+"Erro: Entrada Inválida!"+Color.RESET);
        }
    }
}
