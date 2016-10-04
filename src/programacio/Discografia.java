package programacio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM
 */
public class Discografia {
    // para guardar los discos de nuestra discografia
    private static ArrayList<Disco> misDiscos;

    public static void main(String[] args){
        //inicilizamos la lista
        misDiscos = new ArrayList<>();
        int opcion = 0;
        do{
            mostrarMenu();
            opcion = pedirEntero("Escoge una opcion:");
            switch (opcion){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: System.out.println("Hasta la proxima");break;
                default: System.out.println("Opcion incorrecta");

            }
        } while (opcion != 5);

private static String pedirCadena (String mensaje){


    }
    private static int pedirEntero(String mensaje){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numero = 0;
    boolean error= false;
    do{


        try {
            System.out.println(mensaje);

            numero = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Error de entrada y salida");
        } catch (NumberFormatException ex){
            System.out.println("No has introducido un n entero.");
            error = true;
        }

        } while (error);
        return numero;
    }
    private static void mostrarMenu (){
        System.out.println("----Discografia----");
        System.out.println("1. alta disco");
        System.out.println("2. modificar disco");
        System.out.println("3. eliminar disco");
        System.out.println("4. mostrar disco");
        System.out.println("5. salir");
    }
}

