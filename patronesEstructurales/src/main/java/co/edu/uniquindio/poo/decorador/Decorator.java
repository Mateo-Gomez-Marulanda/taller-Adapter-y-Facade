package main.java.co.edu.uniquindio.poo.decorador;

public abstract class Decorator implements OperacionAritmetica {

    protected OperacionAritmetica operacionAritmetica;

    public Decorator(OperacionAritmetica operacionAritmetica) {
        this.operacionAritmetica = operacionAritmetica;
    }

    @Override
    public void realizarOperacion(double num1, double num2) {
        operacionAritmetica.realizarOperacion(num1, num2);
    }

}