package cafe;



/**
 * Created by DAM on 27/9/16.
 */
public class cafetera {

    public static void main(String[] args){
        moneda miMoneda = new moneda(2);
        maquinaCafe laMaquina = new maquinaCafe(200, 10);


        System.out.println("Cantidad inicial de cafe que tiene la maquina: ");
        System.out.println(laMaquina.getCantidad()+ " ml");
        int cantidadQueBebo = laMaquina.comprarCafe(miMoneda);
        System.out.println("Bebo: "+ cantidadQueBebo + "ml de cafe");
        System.out.println("En la maquina queda : "+ laMaquina.getCantidad() + "ml de cafe");
    }
}

