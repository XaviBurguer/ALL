package pokemon;

/**
 * Created by DAM on 3/10/16.
 */
public class PokemonFoc extends Pokemon {
    private String tipus = "foc";
    private String efectiuContra = "planta";
    private String debilContra = "agua";

    public PokemonFoc(String nom, int atac, int defensa, int salut, String tipus, String efectiuContra, String debilContra) {
        super(nom, atac, defensa, salut);
    }
}
