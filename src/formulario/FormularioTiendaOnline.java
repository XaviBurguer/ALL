package formulario;

import java.util.Date;

public class FormularioTiendaOnline extends Formulario
implements Validable{
	
	public FormularioTiendaOnline(long identificador, String nombre, Date fecha
			, String apellido, String email, long tarjeta
			, double totalGastado) {
		super(identificador, nombre, fecha, apellido);
		// TODO Auto-generated constructor stub
	}
	
	//Atributos: email, Tarjeta Credito, total gastado
	private String email;
	private long tarjeta;
	private double totalGastado;
	
	public void mostrarAtributos(){
            super.mostrarAtributos();//llamamos a mostrar atributos de la clase padre (Formulario)
		System.out.println("email: "+this.email);
		System.out.println("tarjeta: "+this.tarjeta);
		System.out.println("totalGastado: "+this.totalGastado);
	}

    @Override
    public String validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
