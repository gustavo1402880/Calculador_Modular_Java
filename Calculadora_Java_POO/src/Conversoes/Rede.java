package Conversoes;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class Rede
{
    public static void execute()
    {
        try
        {
            System.out.println(Color.AMARELO + " Conversões de Rede " + Color.RESET);
            System.out.println("[1] - Mbps → MB/s");
            System.out.println("[2] - MB/s → Mbps");
            System.out.println("[3] - Gbps → Mbps");
            System.out.println("[4] - Mbps → Gbps");
            System.out.print(": ");
            int option = Reader.rdInt();

            System.out.print("Digite o valor: ");
            double value = Reader.rdDouble();

            double result = switch (option)
            {
                case 1 -> value / 8;
                case 2 -> value * 8;
                case 3 -> value * 1000;
                case 4 -> value / 1000;
                default -> Double.NaN;
            };

            if(Double.isNaN(result))
            {
                System.out.println(Color.VERMELHO + " Opção Inválida "+ Color.RESET);
                Delay.sleep(1500);
            }
            else
            {
                System.out.println("= "+ result);
                Delay.sleep(1500);
            }
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO + "Erro: Entrada inválida "+ Color.RESET);
        }
    }
}
