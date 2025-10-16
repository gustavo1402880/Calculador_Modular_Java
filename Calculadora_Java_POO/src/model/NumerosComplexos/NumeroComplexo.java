package model.NumerosComplexos;

import Ferramentas.Color;

public class NumeroComplexo
{
    private double real;
    private double imaginario;

    private NumeroComplexo(double real, double imaginario)
    {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo soma(NumeroComplexo other)
    {
        return new NumeroComplexo(this.real + other.real, this.imaginario + other.imaginario);
    }

    public NumeroComplexo subtrai(NumeroComplexo other)
    {
        return new NumeroComplexo(this.real - other.real, this.imaginario - other.imaginario);
    }

    public NumeroComplexo multiplica(NumeroComplexo other)
    {
        double real = this.real * other.real - this.imaginario * other.imaginario;
        double imaginario = this.real * other.imaginario + this.imaginario * other.real;
        return  new NumeroComplexo(real, imaginario);
    }

    public NumeroComplexo divide(NumeroComplexo other) {
        double divisor = Math.pow(other.real, 2) + Math.pow(other.imaginario, 2);
        if (divisor == 0) throw new ArithmeticException(Color.VERMELHO+"Divisão por zero em número complexo"+Color.RESET);
        double real = (this.real * other.real + this.imaginario * other.imaginario) / divisor;
        double imaginario = (this.imaginario * other.real - this.real * other.imaginario) / divisor;
        return new NumeroComplexo(real, imaginario);
    }

    public double modulo()
    {
        return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginario,2));
    }

    public NumeroComplexo conjugado()
    {
        return new NumeroComplexo(real, -imaginario);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        if (this.imaginario >= 0)
            return String.format("%.2f + %.2fi", this.real, this.imaginario);
        else
            return String.format("%.2f - %.2fi", this.real, Math.abs(this.imaginario));
    }
}
