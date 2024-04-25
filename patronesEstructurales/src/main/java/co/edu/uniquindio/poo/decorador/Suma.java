package main.java.co.edu.uniquindio.poo.decorador;

public class Suma implements OperacionAritmetica {

    @Override
    public void realizarOperacion(double num1, double num2) {
        double sumar = num1 + num2;
        System.out.println("el resultado de la suma es: " + sumar);
    }

}
