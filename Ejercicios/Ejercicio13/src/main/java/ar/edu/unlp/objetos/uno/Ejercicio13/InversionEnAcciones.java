package ar.edu.unlp.objetos.uno.Ejercicio13;

public class InversionEnAcciones implements Inversion {
	private String nombre;
	private int cantidadAcciones;
	private double valorUnitario;
	
	
	
	public InversionEnAcciones(String name, int cantidad, double valor) {
		this.nombre = name;
		this.cantidadAcciones = cantidad;
		this.valorUnitario = valor;	
	}
	

	public double calcularValorActual() {
		
		double valor = 0;
		valor = this.valorUnitario * this.cantidadAcciones;
		return valor;
		
	}
	
	
	
	
	
	

}
