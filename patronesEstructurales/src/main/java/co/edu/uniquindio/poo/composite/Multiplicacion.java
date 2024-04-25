package main.java.co.edu.uniquindio.poo.composite;

public class Multiplicacion implements OperacionMatematica {
    private double numero1;
    private double numero2;

    public Multiplicacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void resolverProblema(double numero1, double numero2) {
        double multiplicar = numero1 * numero2;
        System.out.println(multiplicar);
    }


}
