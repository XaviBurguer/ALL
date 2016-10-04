package cafe;

/**
 * Created by DAM on 27/9/16.
 */
public class maquinaCafe {
    private int cantidad;
    private int mlPorEuro;

    public maquinaCafe(int cantidad, int mlPorEuro) {
        this.cantidad = cantidad;
        this.mlPorEuro = mlPorEuro;
    }

    public int comprarCafe(moneda m){
        int servido = mlPorEuro * m.getValor();
        setCantidad(cantidad-servido);
        return servido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMlPorEuro() {
        return mlPorEuro;
    }

    public void setMlPorEuro(int mlPorEuro) {
        this.mlPorEuro = mlPorEuro;
    }
}
