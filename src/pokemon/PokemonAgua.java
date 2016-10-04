package pokemon;

/**
 * Created by DAM on 3/10/16.
 */
public class PokemonAgua extends Pokemon {
    private String tipus = "agua";
    private String efectiuContra = "foc";
    private String debilContra = "planta";

    public PokemonAgua(String nom, int atac, int defensa, int salut, String tipus, String efectiuContra, String debilContra) {
        super(nom, atac, defensa, salut);

        this.tipus = tipus;
        this.efectiuContra= efectiuContra;
        this.debilContra= debilContra;
    }
}
