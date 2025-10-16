package model.OperacoesBasicas;

import model.Calculator;

public class Multiplicacao extends Calculator
{
    public Multiplicacao(){}

    public Multiplicacao(Calculator calculator)
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
        atualValue *= value;
        showVisor();
    }
}
