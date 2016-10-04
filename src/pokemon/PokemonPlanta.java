package pokemon;

/**
 * Created by DAM on 3/10/16.
 */
public class PokemonPlanta extends Pokemon {

    private String tipus = "planta";
    private String efectiuContra = "agua";
    private String debilContra = "foc";

    public PokemonPlanta(String nom, int atac, int defensa, int salut, String tipus, String efectiuContra, String debilContra) {
        super(nom, atac, defensa, salut);
    }
}
