/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author Cristian
 */
public class EjemploInterficiesHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un formulario de HAcienda con valores preestablecidos
        FormularioHacienda formHacienda
                = new FormularioHacienda(
                        10001, "Pepe", java.util.Calendar.getInstance().getTime(), "Lupon", 30490.33, 10000.00);
        formHacienda.calculaTotalPagar();
        formHacienda.mostrarAtributos();
        
          //creamos un formulario de TiendaOnline con valores preestablecidos
        FormularioTiendaOnline formTienda
                = new FormularioTiendaOnline(
                        10002, "Juan", java.util.Calendar.getInstance().getTime(),
                        "Pepon", "JuanPepon@gmail.com",
                        903904930,3094.4);
        formTienda.mostrarAtributos();
        
    }

}
