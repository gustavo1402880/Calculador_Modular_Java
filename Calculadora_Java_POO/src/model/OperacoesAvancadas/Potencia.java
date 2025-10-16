package model.OperacoesAvancadas;

import Ferramentas.Color;
import Ferramentas.Reader;
import model.Calculator;

public class Potencia
{
    public static void execute(Calculator calculator)
    {
        double value;

        try
        {
            if (Double.isNaN(calculator.getAtualValue())) {
                System.out.print("Digite um número inteiro para o fatorial: ");
                value = Reader.rdDouble();
            } else {
                value = calculator.getAtualValue();
                System.out.println("Usando valor atual: " + value);
            }

            if (value < 0 || value != Math.floor(value)) {
                System.out.println(Color.VERMELHO+"Erro: fatorial só é válido para inteiros não negativos."+ Color.RESET);
                return;
            }

            double result = 1;
            for (int i = 1; i <= (int) value; i++) {
                result *= i;
            }

            calculator.setAtualValue(result);
            System.out.println("Resultado do fatorial: " + result);

        }
        catch (Exception e)
        {
            System.out.println(Color.VERMELHO+ "Erro: Entrada Inválida!"+ Color.RESET);
        }
    }
}
