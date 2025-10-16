package model.Conversoes;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class Processamento
{
    public static void execute()
    {
        try
        {
            System.out.println("\n "+ Color.CIANO + "Conversões de Frequência" + Color.RESET);
            System.out.println("[1] GHz → MHz");
            System.out.println("[2] MHz → GHz");
            System.out.print("Escolha: ");
            int option = Reader.rdInt();

            System.out.print("Digite o valor: ");
            double value = Reader.rdDouble();

            double result = switch (option) {
                case 1 -> value * 1000;
                case 2 -> value / 1000;
                default -> Double.NaN;
            };

            if(Double.isNaN(result))
            {
                System.out.println(Color.VERMELHO + "Opção Inválida " + Color.RESET);
                Delay.sleep(1500);
            }
            else
            {
                System.out.println("= " + result);
            }
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO + " Erro: Entrada Inválida " + Color.RESET);
        }
    }
}
