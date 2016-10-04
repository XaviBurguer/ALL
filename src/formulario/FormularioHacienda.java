package formulario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
/**Queremos crear un formulario de Hacienda que contenga la informaci�n de un Formulario y:
Atributos: Ingresos, Impuestos , total a pagar
Funci�n: calcula el total a pagar (hay que pagar el 20% de ingresos � Impuestos)

 * 
 * @author Cristian
 *
 */
public class FormularioHacienda extends Formulario
implements Validable
{
	private double ingresos;
	private double impuestos;
	private double totalPagar;
	@Override
	public String validar(){
		
		return "ok";
	}
//	public void pideDatos() throws IOException{
//		super.pideDatos();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("ingresos");
//		ingresos = Double.parseDouble(br.readLine());
//		
//		System.out.println("impuestos");
//		br.readLine();
//		impuestos = Double.parseDouble(br.readLine());
//		
//		calculaTotalPagar();
//	}
	public FormularioHacienda (
			long identificador,
			String nombre
			, Date fecha
			, String apellido
			, double ingresos
			,double impuestos) {
		super(identificador, nombre, fecha, apellido);
		
		this.ingresos=ingresos;
		this.impuestos=impuestos;
	}
	/*
	 * ay que pagar el 20% de ingresos � Impuestos)
	 */
	public void calculaTotalPagar(){
		this.totalPagar=this.ingresos*0.2 - this.impuestos; 
	}
	
	public void mostrarAtributos(){
            super.mostrarAtributos();//llamamos a mostrar atributos de la clase padre (Formulario)
		System.out.println("ingresos: "+this.ingresos);
		System.out.println("impuestos: "+this.impuestos);
		System.out.println("totalPagar: "+this.totalPagar);
	}

	
}
