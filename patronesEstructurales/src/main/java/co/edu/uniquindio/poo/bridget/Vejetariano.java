package main.java.co.edu.uniquindio.poo.bridget;

public class Vejetariano extends Pizza {
    public Vejetariano(Tamanio tamanio) {
        super(tamanio);
    }

    @Override
    public void elegirSabor() {
        System.out.println("La pizza es vejetatiana");
        tamanio.elegirTamanio();
    }

}
