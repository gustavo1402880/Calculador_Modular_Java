package model.Algebra;

import Ferramentas.Color;
import Ferramentas.Reader;

public class Equacao2Grau
{
    public static void opration()
    {
        try
        {
            System.out.println("Equação: ax² + bx + c = 0");
            System.out.print("a: ");
            double a = Reader.rdDouble();
            System.out.print("b: ");
            double b = Reader.rdDouble();
            System.out.print("c: ");
            double c = Reader.rdDouble();

            if (a == 0) {
                System.out.print("\n" + Color.VERMELHO + "Não é equação de 1° grau ( a = 0 )." + Color.RESET);
                return;
            }

            double delta = b * b - 4 * a * c;

            if (delta < 0)
            {
                System.out.println("\n" + Color.VERMELHO + "Não existem raízes reais." + Color.RESET);
            }
            else if (delta == 0)
            {
                double x = -b / (2 * a);
                System.out.println("Raiz dupla: x = " + x);
            }
            else
            {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
        catch (Exception e)
        {
            System.out.println("\n" + Color.VERMELHO + "Erro: entrada inválida!" + Color.RESET);
        }
    }
}
