package ar.edu.unlp.objetos.uno.Ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item(String det,int cant,double costoUni) {
		
		this.detalle = det;
		this.cantidad = cant;
		this.costoUnitario = costoUni;
		
	}
	
	
	public double costo() {
		double c = this.getCantidad() * this.getCostoUnitario();
		return c;
	}


	private double getCantidad() {
		return this.cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}



}
