package programacio;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Coche> cochesList = new ArrayList<>();

        Coche jaguar = new Coche("2323JDM","Jaguar","F-Type",80000.0,"rojo");
        Coche audi = new Coche("5690HJM","Audi","R8",120000.0,"azul");
        Coche mercedes = new Coche("9821MRD","Mercedes","a45 AMG",45000.0,"negro");
        Coche lamborghini = new Coche("6666FRR","Lamborghini","Huracan",200000.0,"amarillo");

        cochesList.add(jaguar);
        cochesList.add(audi);
        cochesList.add(mercedes);
        cochesList.add(lamborghini);

        System.out.println("Muestro el jaguar:" + cochesList.get(3));

    }

}
