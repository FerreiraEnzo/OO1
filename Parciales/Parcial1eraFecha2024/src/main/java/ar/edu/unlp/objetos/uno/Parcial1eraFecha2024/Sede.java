package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

public class Sede {
	private String lugar;
	private double precioPorDia;
	private int cantDias;
	
	
	public Sede(String lugar, double precio, int cant) {
		this.lugar = lugar;
		this.precioPorDia = precio;
		this.cantDias = cant;
	}
	
	public double calcularMonto() {
		return this.cantDias * this.precioPorDia;
	}

}
