package main.java.co.edu.uniquindio.poo.decorador;

public class App {
    
    public static void main(String[] args){
        OperacionAritmetica suma = new Suma(5.0, 4.0);
        OperacionAritmetica multiplicacion = new MultiplicacionDecorador(suma);

        multiplicacion.realizarOperacion(5.0, 4.0);
    }
    
}
