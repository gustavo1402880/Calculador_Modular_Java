package model;

public abstract class Calculator
{

    protected double atualValue = Double.NaN;

    public double getAtualValue()
    {
        return atualValue;
    }
    public void setAtualValue(double atualValue)
    {
        atualValue = atualValue;
    }
    public void zerar()
    {
        atualValue = Double.NaN;
    }
    public boolean hasValue()
    {
        return !Double.isNaN(atualValue);
    }
    public void showVisor()
    {
        if(Double.isNaN(getAtualValue()))
        {
            System.out.println("--------------------------");
            System.out.println("= 0.0     ");
            System.out.println("--------------------------");
        }
        else
        {
            System.out.println("--------------------------");
            System.out.println("= "+ (Double.isNaN(atualValue) ? "N/A " : atualValue));
            System.out.println("--------------------------");
        }
    }
    public abstract void operation(double value);
}
