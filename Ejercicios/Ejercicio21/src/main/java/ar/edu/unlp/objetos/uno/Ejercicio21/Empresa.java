package ar.edu.unlp.objetos.uno.Ejercicio21;

public class Empresa extends Cliente{
	private int CUIT;
	
	public Empresa(String nombre,String direccion, int CUIT) {
		super(nombre, direccion);
		this.CUIT = CUIT;
	}

	
	public double calcularMontoConDescuento(double precio) {
		return precio;
	}
	
}
