package main.java.co.edu.uniquindio.poo.decorador;

public class RestaDecorador extends Decorator {

    public RestaDecorador(OperacionAritmetica operacionAritmetica) {
        super(operacionAritmetica);
    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        operacionAritmetica.realizarOperacion(num1, num2);
        restar(num1, num2);
    }

    public void restar(double num1, double num2) {
        double resta = num1 - num2;
        System.out.println("el resultado es: " + resta);
    }

}
