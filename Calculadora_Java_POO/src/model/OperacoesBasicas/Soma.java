package model.OperacoesBasicas;

import model.Calculator;

public class Soma extends Calculator
{
    public Soma(){}

    public Soma(Calculator calculator)
    {
        this.atualValue = calculator.getAtualValue();
    }

    @Override
    public void operation(double value)
    {
        if(!hasValue())
        {
            atualValue = 0;
        }
        atualValue += value;
        showVisor();
    }
}
