package ar.edu.unlp.objetos.uno.Ejercicio24;

public class Producto {
	private String nombre;
	private String tipoMaterial;
	private double costo;
	private boolean esBiodegradable;
	
	public Producto(String name, String tipo, double unCosto, boolean biodegradable) {
		this.nombre = name;
		this.tipoMaterial = tipo;
		this.costo = unCosto;
		this.esBiodegradable = biodegradable;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	
	
	
}
