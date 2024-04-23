package co.edu.uniquindio.poo.adapter;

public class App {
    public static void main(String[] args) {

        var calculadoraEntero = new CalculadoraEntero();
        var adaptadorCalculadora = new AdaptadorCalculadora(calculadoraEntero);


        adaptadorCalculadora.sumarDecimales(2.9, 8.9);
        System.err.println(adaptadorCalculadora);

    }
}
