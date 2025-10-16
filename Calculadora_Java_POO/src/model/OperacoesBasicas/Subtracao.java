package model.OperacoesBasicas;

import model.Calculator;

public class Subtracao extends Calculator
{
    public Subtracao(){}

    public Subtracao(Calculator calculator)
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
        atualValue -= value;
        showVisor();
    }
}
