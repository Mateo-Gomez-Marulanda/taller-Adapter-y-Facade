package main.java.co.edu.uniquindio.poo.decorador;

public class RestaDecorator extends Decorator {

    public RestaDecorator(OperacionAritmetica operacionAritmetica) {
        super(operacionAritmetica);
    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        // Llamar al método de la operación original
        super.realizarOperacion(num1, num2);

        // Realizar la operación de resta
        restar(num1, num2);
    }

    private void restar(double num1, double num2) {
        double resta = num1 - num2;
        System.out.println("el resultado de la resta es: " + resta);
    }
}
