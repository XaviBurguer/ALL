package Biblio;

/**
 * Created by DAM on 27/9/16.
 */
public class Libro {
    private String Titulo;
    private Autor Autor;
    private String Genero;
    private int numeroPaginas;

    public Libro(String titulo, Biblio.Autor Autor, String genero, int numeroPaginas) {
        Titulo = titulo;
        Autor = Autor;
        Genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    public Biblio.Autor getAutor() {
        return Autor;
    }

    public void setAutor(Biblio.Autor autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
