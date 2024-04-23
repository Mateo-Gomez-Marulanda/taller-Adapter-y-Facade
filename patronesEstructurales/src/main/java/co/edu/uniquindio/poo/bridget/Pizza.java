package main.java.co.edu.uniquindio.poo.bridget;

public abstract class Pizza {

   protected Tamanio tamanio;

   public Pizza(Tamanio tamanio) {
      this.tamanio = tamanio;
   }

   public abstract void elegirSabor();
   
}
