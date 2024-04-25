package main.java.co.edu.uniquindio.poo.decorador;

public abstract class Decorador implements OperacionAritmetica {
    protected OperacionAritmetica operacionAritmetica;

    public Decorador(OperacionAritmetica operacionAritmetica) {
        this.operacionAritmetica = operacionAritmetica;
    }


    @Override
    public void realizarOperacion(double num1, double num2){
        this.operacionAritmetica.realizarOperacion(num1, num2);
    }

}
