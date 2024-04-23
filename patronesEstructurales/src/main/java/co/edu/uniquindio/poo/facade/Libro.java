package co.edu.uniquindio.poo.facade;

public class Libro {
    private String titutulo;
    private String autor;
    private String categoria;

    public Libro(String titutlo, String autor, String categoria) {
        this.titutulo = titutlo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitutlo() {
        return titutulo;
    }

    public void setTitutlo(String titutlo) {
        this.titutulo = titutlo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro [titutlo=" + titutulo + ", autor=" + autor + ", categoria=" + categoria + "]";
    }

}
