package co.edu.uniquindio.poo.facade;

public class BibliotecaFacade {
    private BuscarLibro buscador;

    public BibliotecaFacade(BuscarLibro buscador) {
        this.buscador = buscador;
    }

    public void buscarPorAutor(String autor) {
        buscador.buscarPorAutor(autor);
    }

    public void buscarPorTitulo(String titulo) {
        buscador.buscarPorTitulo(titulo);
    }

    public void buscarPorCategoria(String categoria) {
        buscador.buscarPorCategoria(categoria);
    }

}
