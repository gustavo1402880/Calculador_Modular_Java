package model.OperacoesAvancadas;

import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;
import model.Calculator;

public class RaizQuadrada
{
    public static void execute(Calculator calculator)
    {
        double value;

        try
        {
            if (Double.isNaN(calculator.getAtualValue())) {
                System.out.print("Digite um número para a raiz quadrada: ");
                value = Reader.rdDouble();
            } else {
                value = calculator.getAtualValue();
                System.out.println("Usando valor atual: " + value);
            }

            if (value < 0) {
                System.out.println(Color.VERMELHO+"Erro: não existe raiz quadrada real de número negativo."+Color.RESET);
                Delay.sleep(1500);
                return;
            }

            double result = Math.sqrt(value);
            calculator.setAtualValue(result);
            System.out.println("Resultado da raiz: " + result);
            Delay.sleep(1500);
        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO+"Erro: Entrada Inválida!"+Color.RESET);
        }
    }
}
