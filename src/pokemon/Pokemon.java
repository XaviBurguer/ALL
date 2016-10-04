package pokemon;

/**
 * Created by DAM on 3/10/16.
 */
public class Pokemon {
    private String nom;
    private int atac;
    private int defensa;
    private int salut;

    public Pokemon(String nom, int atac, int defensa, int salut) {
        this.nom = nom;
        this.atac = atac;
        this.defensa = defensa;
        this.salut = salut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAtac() {
        return atac;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getSalut() {
        return salut;
    }

    public void setSalut(int salut) {
        this.salut = salut;
    }
    public void mostrarDatos(){
        System.out.println("Pokemon: "+this.nom);
        System.out.println("Atac: "+this.atac);
        System.out.println("Defensa: "+this.defensa);
        System.out.println("Slut: "+this.salut);
    }
}
