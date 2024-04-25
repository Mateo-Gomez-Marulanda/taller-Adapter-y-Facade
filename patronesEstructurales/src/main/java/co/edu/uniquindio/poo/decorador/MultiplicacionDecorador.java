package main.java.co.edu.uniquindio.poo.decorador;

public class MultiplicacionDecorador extends Decorator {
    public MultiplicacionDecorador(OperacionAritmetica operacionAritmetica) {
        super(operacionAritmetica);
    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        operacionAritmetica.realizarOperacion(num1, num2);
        multiplicar(num1, num2);
    }

    public void multiplicar(double num1, double num2) {
        double multiplicacion = num1 * num2;
        System.out.println("el resultado es: " + multiplicacion);
    }

}
