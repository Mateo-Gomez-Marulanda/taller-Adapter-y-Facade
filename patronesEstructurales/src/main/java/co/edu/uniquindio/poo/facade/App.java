package co.edu.uniquindio.poo.facade;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Libro> listaLibros = new ArrayList<>();

        var libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", "Fábula");
        var libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela");
        var libro3 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Realismo Magico");

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        BuscarLibro buscador = new BuscarLibro(listaLibros);
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade(buscador);

        System.out.println("Libros de Gabriel Garcia Marquez:");
        bibliotecaFacade.buscarPorAutor("Gabriel Garcia Marquez");

        System.out.println("\nLibros con título 'El principito':");
        bibliotecaFacade.buscarPorTitulo("El principito");

        System.out.println("\nLibros de la categoría 'Novela':");
        bibliotecaFacade.buscarPorCategoria("Novela");
    }
}
