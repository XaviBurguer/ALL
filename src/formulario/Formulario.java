package formulario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Queremos estructurar la informaci�n de un Formulario Gen�rico. 
 * Un formulario ha de tener:
Atributos: Identificador , Fecha , Nombre , Apellido
Funciones: borrar atributos, mostrar datos
 * 
 */
public class Formulario {
	private long identificador; 
	private String nombre;
	private java.util.Date fecha;
	private String apellido;
	
//	public void pideDatos() throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("nombre");
//		br.readLine();
//		System.out.println("apellido");
//		br.readLine();
//		fecha = java.util.Calendar.getInstance().getTime();
//	}
	public void borrarAtributos(){
		this.identificador=0;
		this.nombre="";
		this.fecha=null;
		this.apellido="";
	}
	
	public void mostrarAtributos(){
		System.out.println("nombre:"+this.nombre);
		System.out.println("apellido:"+this.apellido);
		System.out.println("identificador:"+this.identificador);
		System.out.println("fecha:"+this.fecha);
	}
	
	public Formulario(long identificador, String nombre, Date fecha, String apellido) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.fecha = fecha;
		this.apellido = apellido;
	}
	
	
	public long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}
	public java.util.Date getFecha() {
		return fecha;
	}
	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	
}
