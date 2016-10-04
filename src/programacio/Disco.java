package programacio;

public class Disco {

    private String titulo;

    private String artista;

    private int temas;

    private double duracion;

    public Disco(String titulo, String artista, int temas, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.temas = temas;
        this.duracion = duracion;
    }

    /**
     * Get the value of decimal
     *
     * @return the value of decimal
     */
    public double getDecimal() {
        return duracion;
    }

    /**
     * Set the value of decimal
     *
     * @param decimal new value of decimal
     */
    public void setDecimal(double decimal) {
        this.duracion = duracion;
    }


    /**
     * Get the value of temas
     *
     * @return the value of temas
     */
    public int getTemas() {
        return temas;
    }

    /**
     * Set the value of temas
     *
     * @param temas new value of temas
     */
    public void setTemas(int temas) {
        this.temas = temas;
    }


    /**
     * Get the value of artista
     *
     * @return the value of artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Set the value of artista
     *
     * @param artista new value of artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
