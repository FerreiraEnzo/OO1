package ar.edu.unlp.objetos.uno.Ejercicio29;

public class Item {
	private String nombre;
	private int cantidad;
	private double precioUnitario;
	
	
	public Item(String name, int cantidad, double precio) {
		this.nombre = name;
		this.cantidad = cantidad;
		this.precioUnitario = precio;
	}
	
	public double precioFinal() {
		return this.cantidad * this.precioUnitario;
	}
	

}
