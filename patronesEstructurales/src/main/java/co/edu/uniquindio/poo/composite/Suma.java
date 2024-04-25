package main.java.co.edu.uniquindio.poo.composite;

public class Suma implements OperacionMatematica {

    private double numero1;
    private double numero2;

    public Suma(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //metodos gets y sets

    public void resolverProblema(double numero1, double numero2) {
        double sumar = numero1 + numero2;
        System.out.println(sumar);
    }

}


