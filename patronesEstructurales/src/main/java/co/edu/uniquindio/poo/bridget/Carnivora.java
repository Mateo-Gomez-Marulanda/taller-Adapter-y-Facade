package main.java.co.edu.uniquindio.poo.bridget;

public class Carnivora extends Pizza {
    public Carnivora(Tamanio tamanio) {
        super(tamanio);
    }

    @Override
    public void elegirSabor() {
        System.out.println("La pizza es Carnivora");
        tamanio.elegirTamanio();
    }

}
