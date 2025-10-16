package model.Trigonometria;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;

public class Trigonometria
{
    public static void seno() {
        try {
            System.out.print("Digite o ângulo (em graus): ");
            double angule = Math.toRadians(Reader.rdDouble());
            System.out.println("Seno: " + Math.sin(angule));
            Delay.sleep(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }

    public static void cosseno() {
        try {
            System.out.print("Digite o ângulo (em graus): ");
            double angule = Math.toRadians(Reader.rdDouble());
            System.out.println("Cosseno: " + Math.cos(angule));
            Delay.sleep(2000);

        } catch (Exception e) {
            System.out.println(Color.VERMELHO+"Erro: entrada inválida!"+Color.RESET);
        }
    }

    public static void tangente() {
        try {
            System.out.print("Digite o ângulo (em graus): ");
            double angule = Math.toRadians(Reader.rdDouble());
            System.out.println("Tangente: " + Math.tan(angule));
            Delay.sleep(2000);

        } catch (Exception e) {
            System.out.println(Color.VERMELHO+"Erro: entrada inválida!"+Color.RESET);
        }
    }
}
