package co.edu.uniquindio.poo.facade;

import java.util.List;

public class BuscarLibro {
    private List<Libro> listaLibros;
   

    public BuscarLibro(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void buscarPorAutor(String autor){
        for(Libro libro: listaLibros)
        if (libro.getAutor().equals(autor)){
            System.out.println(libro);
        }
    }

    public void buscarPorTitulo(String titulo){
        for(Libro libro: listaLibros)
        if (libro.getTitutlo().equals(titulo)){
            System.out.println(libro);
        }
    }

    public void buscarPorCategoria(String categoria){
        for(Libro libro: listaLibros)
        if (libro.getCategoria().equals(categoria)){
            System.out.println(libro);
        }
    }

}
