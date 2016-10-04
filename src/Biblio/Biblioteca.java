package Biblio;

/**
 * Created by DAM on 27/9/16.
 */
public class Biblioteca {

    public static void main(String[] args){
        Autor michael = new Autor("Michael", "Ende", "EUUU");
        Libro miLibro = new Libro("La historia interminable", michael, "fantasia", 450);
    }

}
