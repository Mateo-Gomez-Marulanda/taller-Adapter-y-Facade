package main.java.co.edu.uniquindio.poo.composite;

public class App {
    public static void main(String[] args) {

        OperacionMatematica multiplicacion = new Multiplicacion(2.0, 3.0);
        multiplicacion.resolverProblema(2.0, 3.0);

        OperacionMatematica suma = new Suma(2.0, 4.0);
        suma.resolverProblema(2.0, 4.0);
    }
}


