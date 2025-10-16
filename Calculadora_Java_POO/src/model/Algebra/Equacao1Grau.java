package model.Algebra;

import Ferramentas.Color;
import Ferramentas.Reader;

public class Equacao1Grau
{
    public static void operation()
    {
        try {
            System.out.println("Equação: ax + b = 0");
            System.out.print("a: ");
            double a = Reader.rdDouble();
            System.out.print("b: ");
            double b = Reader.rdDouble();

            if (a == 0) {
                System.out.print("\n" + Color.VERMELHO + " Não é equação de 1° grau ( a = 0 ).");
                return;
            }

            double x = -b / a;
            System.out.println("x = " + x);
        } catch (Exception e) {
            System.out.print("\n" + Color.VERMELHO + "Erro: Entrada Inválida!");
        }
    }
}
