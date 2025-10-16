package model.Conversoes;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class Armazenamento
{
    public static void execute()
    {
        try
        {
            System.out.println("\n" + Color.ROXO + "Conversões de Armazenamento" + Color.RESET);
            System.out.println("[1] - Bytes → KB");
            System.out.println("[2] - KB → MB");
            System.out.println("[3] - MB → GB");
            System.out.println("[4] - GB → TB");
            System.out.println("[5] - TB → GB");
            System.out.println("[6] - GB → MB");
            System.out.print(": ");

            int option = Reader.rdInt();

            System.out.print("Digite o Valor: ");
            double value = Reader.rdDouble();

            double result = switch (option)
            {
                case 1 -> value / 1024;
                case 2 -> value / 1024;
                case 3 -> value / 1024;
                case 4 -> value / 1024;
                case 5 -> value * 1024;
                case 6 -> value *1024;
                default -> Double.NaN;
            };

            if(Double.isNaN(result))
            {
                System.out.println(Color.VERMELHO + "Opção inválida " + Color.RESET);
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
            System.out.println("Erro: Entrada Inválida!");
        }
    }
}
