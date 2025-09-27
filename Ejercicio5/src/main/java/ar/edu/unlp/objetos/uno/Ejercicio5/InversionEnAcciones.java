package ar.edu.unlp.objetos.uno.Ejercicio5;

public class InversionEnAcciones implements Inversion {
	private String nombre;
	private int cantidadAcciones;
	private double valorUnitario;
	
	
	
	public double calcularValorActual() {
		
		double valor = 0;
		valor = this.valorUnitario * this.cantidadAcciones;
		return valor;
		
	}
	
	
	
	
	
	

}
