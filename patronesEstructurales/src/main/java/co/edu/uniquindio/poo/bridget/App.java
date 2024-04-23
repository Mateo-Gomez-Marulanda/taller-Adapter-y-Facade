package main.java.co.edu.uniquindio.poo.bridget;

public class App {
    public static void main(String[] args) {

        Tamanio tamanioFamiliar = new Familiar();

        Pizza pizzaCarnivora = new Carnivora(tamanioFamiliar);
        Pizza pizzaVejetariana = new Vejetariano(tamanioFamiliar);

        pizzaCarnivora.elegirSabor();
        pizzaVejetariana.elegirSabor();
            
        
    }
}
