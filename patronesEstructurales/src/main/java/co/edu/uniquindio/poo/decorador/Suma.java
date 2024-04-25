package main.java.co.edu.uniquindio.poo.decorador;

public class Suma implements OperacionAritmetica {
    private double num1;
    private double num2;

    public Suma(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        double sumar = num1 + num2;
        System.out.println(sumar);
    }

}
