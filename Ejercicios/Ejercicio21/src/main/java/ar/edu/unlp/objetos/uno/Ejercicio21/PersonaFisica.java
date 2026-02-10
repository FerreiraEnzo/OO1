package ar.edu.unlp.objetos.uno.Ejercicio21;


public class PersonaFisica extends Cliente{
	private int DNI;

	
	public PersonaFisica(String nombre,String direccion, int DNI) {
		super(nombre, direccion);
		this.DNI = DNI;
	}
	
	
	public double calcularMontoConDescuento(double precio) {
		
		return precio * 0.9;
		
	}
	
}
