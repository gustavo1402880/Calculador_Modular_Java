package Conversoes;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class Tempo
{
    public static void execute()
    {
        try
        {
            System.out.println(Color.AZUL + "Conversões de Tempo" + Color.RESET);
            System.out.println("[1] - Segundos → Minutos");
            System.out.println("[2] - Minutos → Horas");
            System.out.println("[3] - Horas → Minutos");
            System.out.println("[4] - Minutos → Segundos");
            System.out.print(": ");
            int option = Reader.rdInt();

            System.out.print("Digite o valor: ");
            double value = Reader.rdDouble();

            double result = switch (option)
            {
                case 1 -> value / 60;
                case 2 -> value / 60;
                case 3 -> value * 60;
                case 4 -> value * 60;
                default -> Double.NaN;
            };

            if(Double.isNaN(result))
            {
                System.out.println(Color.VERMELHO + " Opção Inválida " + Color.RESET);
                Delay.sleep(1500);
            }
            else
            {
                System.out.println("= " + result);
                Delay.sleep(1500);
            }
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO + "Erro: Entrada Inválida!" + Color.RESET);
        }
    }
}
