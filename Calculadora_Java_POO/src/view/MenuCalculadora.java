package view;

import Ferramentas.Cls;
import Ferramentas.Color;
import Ferramentas.Delay;
import Ferramentas.Reader;
import model.Algebra.Equacao1Grau;
import model.Algebra.Equacao2Grau;
import model.Calculator;
import model.Conversoes.Armazenamento;
import model.Conversoes.Processamento;
import model.Conversoes.Rede;
import model.Conversoes.Tempo;
import model.NumerosComplexos.OperacoesComplexas;
import model.OperacoesAvancadas.Fatorial;
import model.OperacoesAvancadas.Potencia;
import model.OperacoesAvancadas.RaizQuadrada;
import model.OperacoesBasicas.Divisao;
import model.OperacoesBasicas.Multiplicacao;
import model.OperacoesBasicas.Soma;
import model.OperacoesBasicas.Subtracao;
import model.Teoria.MDC;
import model.Teoria.MMC;
import model.Teoria.Module;
import model.Trigonometria.Trigonometria;

import java.util.InputMismatchException;

public class MenuCalculadora
{
    public static Calculator calculator = new Soma();

    public static void exibir()
    {
        boolean shutOff = false;
        int option;

        do
        {
            Cls.cls(15);
            System.out.println(Color.CIANO+"- - - - - - - - - - - - - - - - - - -"+Color.RESET);
            System.out.println(Color.ROXO+"          C"+Color.AZUL+"A"+Color.CIANO+"L"+Color.VERDE+"C"+Color.AMARELO+"U"+Color.CIANO+"L"+Color.VERMELHO+"A"+Color.ROXO+"D"+Color.AZUL+"O"+Color.CIANO+"R"+Color.VERDE+"A"+Color.RESET);
            System.out.println(Color.CIANO+"- - - - - - - - - - - - - - - - - - -"+Color.RESET);
            calculator.showVisor();

            System.out.println(Color.CIANO+"[0]  - LIMPAR CALCULADORA                    [5]  - RAIZ QUADRADA");
            System.out.println("[1]  - SOMAR                                 [6]  - POTÊNCIA");
            System.out.println("[2]  - SUBTRAIR                              [7]  - FATORIAL");
            System.out.println("[3]  - MULTIPLICAR");
            System.out.println("[4]  - DIVIDIR");

            System.out.println();

            System.out.println("[8]  - EQUAÇÃO DE 1º GRAU                   [10] - MMC");
            System.out.println("[9]  - EQUAÇÃO DE 2º GRAU                   [11] - MDC");
            System.out.println("                                            [12] - MÓDULO");

            System.out.println();

            System.out.println("[13] - SENO                                 [17] - CONVERSÃO DE ARMAZENAMENTO");
            System.out.println("[14] - COSSENO                              [18] - CONVERSÃO DE REDE");
            System.out.println("[15] - TANGENTE                             [19] - CONVERSÃO DE PROCESSAMENTO");
            System.out.println("[16] - CONVERSÃO DE TEMPO                   [20] - OPERAÇÕES COM NÚMEROS COMPLEXOS");
            System.out.println("[21] - ARREDONDAR");

            System.out.println();

            System.out.println("[99] - SAIR"+Color.RESET);

            try
            {
                System.out.print("\n: ");
                option = Reader.rdInt();

                Cls.cls(3);

                switch (option)
                {
                    case 0 -> zerar();
                    case 1 -> operar(new Soma(calculator), "Soma");
                    case 2 -> operar(new Subtracao(calculator), "Subtração");
                    case 3 -> operar(new Multiplicacao(calculator), "Multiplicação");
                    case 4 -> operar(new Divisao(calculator), "Divisão");

                    // Matemática avançada
                    case 5 -> RaizQuadrada.execute(calculator);
                    case 6 -> Potencia.execute(calculator);
                    case 7 -> Fatorial.execute(calculator);

                    // Equações
                    case 8 -> Equacao1Grau.operation();
                    case 9 -> Equacao2Grau.operation();

                    // Teoria dos números
                    case 10 -> MMC.execute();
                    case 11 -> MDC.execute();
                    case 12 -> Module.execute();

                    // Trigonometria
                    case 13 -> Trigonometria.seno();
                    case 14 -> Trigonometria.cosseno();
                    case 15 -> Trigonometria.tangente();

                    // Conversões
                    case 16 -> Tempo.execute();
                    case 17 -> Armazenamento.execute();
                    case 18 -> Rede.execute();
                    case 19 -> Processamento.execute();

                    // Numeros Complexos
                    case 20 -> OperacoesComplexas.execute();

                    // Arredondar
                    case 21 -> calculator.setAtualValue(Math.round(calculator.getAtualValue()));

                    // Termina a Calculadora
                    case 99 -> {
                        System.out.println(Color.AMARELO+ "\nEncerrando calculadora..." + Color.RESET);
                        Delay.sleep(1000);
                        shutOff = true;
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println(Color.VERMELHO+"Erro: Entrada Inválida!"+ Color.RESET);
                Reader.rdString();
                Delay.sleep(2000);
            }
        }
        while (!shutOff);
    }
    private static void operar(Calculator operacao, String nome) {
        System.out.print(Color.VERDE+ "Valor " + nome + " : " + Color.RESET);
        try {
            double valor = Reader.rdDouble();

            operacao.operation(valor);
            Cls.cls(10);
            calculator = operacao;

            operacao.showVisor();
            System.out.println();

        } catch (InputMismatchException e) {
            System.err.println("\n-- Digite apenas números --\n");
            Reader.rdString();
            Delay.sleep(1500);
        }
    }
    private static void zerar()
    {
        if(calculator != null)
        {
            calculator.zerar();
        }
        else
        {
            System.out.println(Color.VERMELHO+"Nenhuma calculadora ativa para zerar!"+Color.RESET);
        }
        Delay.sleep(1000);
    }
}
