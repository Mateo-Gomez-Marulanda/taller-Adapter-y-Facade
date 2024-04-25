package main.java.co.edu.uniquindio.poo.decorador;

public class MultiplicacionDecorator extends Decorator {
    public MultiplicacionDecorator(OperacionAritmetica operacionAritmetica) {
        super(operacionAritmetica);
    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        // Llamar al método de la operación original
        super.realizarOperacion(num1, num2);

        // Realizar la operación de resta
        multiplicar(num1, num2);
    }

    private void multiplicar(double num1, double num2) {
        double multiplicacion = num1 * num2;
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
    }

}
