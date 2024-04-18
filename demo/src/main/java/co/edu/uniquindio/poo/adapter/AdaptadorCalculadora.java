package co.edu.uniquindio.poo.adapter;

public class AdaptadorCalculadora implements CalculadoraDecimales {

    private CalculadoraEntero calculadoraEntero;

    public AdaptadorCalculadora(CalculadoraEntero calculadoraEntero) {
        this.calculadoraEntero = calculadoraEntero;
    }

    @Override
    public void sumarDecimales(double nm1, double nm2) {
        int num1 = (int) nm1;
        int num2 = (int) nm2;
        
        this.calculadoraEntero.sumar(num1,num2);

    }

}
