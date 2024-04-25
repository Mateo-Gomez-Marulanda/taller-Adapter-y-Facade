package main.java.co.edu.uniquindio.poo.decorador;

public class Main {

    public static void main(String[] args) {

        OperacionAritmetica suma = new Suma();
        OperacionAritmetica resta = new RestaDecorator(suma);
        OperacionAritmetica divicion = new DivisonDecorator(suma);
        resta.realizarOperacion(5.0, 2.0);
        divicion.realizarOperacion(5.0, 5.0);

    }

}
