package model.OperacoesBasicas;

import Ferramentas.Color;
import model.Calculator;

public class Divisao extends Calculator
{
    public Divisao(){}

    public Divisao(Calculator calculator)
    {
        this.atualValue = calculator.getAtualValue();
    }

    @Override
    public void operation(double value)
    {
        if(value == 0)
        {
            System.out.println(Color.VERMELHO+"Erro: Divisão por zero"+ Color.RESET);
            return;
        }
        else if(!hasValue())
        {
            atualValue = value;
        }
        else
        {
            atualValue /= value;
        }
    }
}
