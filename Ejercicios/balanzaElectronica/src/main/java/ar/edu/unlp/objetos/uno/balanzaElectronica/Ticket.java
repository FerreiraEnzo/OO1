package ar.edu.unlp.objetos.uno.balanzaElectronica;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	
	public Ticket(int cantProd,double precio,double peso) {
		
		this.fecha = LocalDate.now();
		this.setCantidadDeProductos(cantProd);
		this.setPesoTotal(peso);
		this.setPrecioTotal(precio);	
	}
	
	public double impuesto() {
		
		double imp = this.precioTotal * 0.21;
		return imp;
		
	}


	public LocalDate getFecha() {
		return fecha;
	}


	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	private void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}


	public double getPesoTotal() {
		return this.pesoTotal;
	}


	private void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public double getPrecioTotal() {
		return this.precioTotal;
	}


	private void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	
}
