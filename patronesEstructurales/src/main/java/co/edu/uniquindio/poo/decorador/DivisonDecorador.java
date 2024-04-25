package main.java.co.edu.uniquindio.poo.decorador;

public class DivisonDecorador extends Decorator {
    public DivisonDecorador(OperacionAritmetica operacionAritmetica) {
        super(operacionAritmetica);

    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        operacionAritmetica.realizarOperacion(num1, num2);
        dividir(num1, num2);
    }

    public void dividir(double num1, double num2) {
        double division = num1 / num2;
        System.out.println("el resultado es: " + division);
    }

}
