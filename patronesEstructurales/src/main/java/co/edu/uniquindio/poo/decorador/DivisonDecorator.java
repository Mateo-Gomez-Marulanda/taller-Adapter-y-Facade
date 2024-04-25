package main.java.co.edu.uniquindio.poo.decorador;

public class DivisonDecorator extends Decorator {
    public DivisonDecorator(OperacionAritmetica operacionAritmetica) {
        super(operacionAritmetica);

    }

    @Override
    public void realizarOperacion(double num1, double num2) {

        super.realizarOperacion(num1, num2);

        dividir(num1, num2);
    }

    private void dividir(double num1, double num2) {
        double divicion = num1 / num2;
        System.out.println("el resultado de la divicion es: " + divicion);
    }

}
