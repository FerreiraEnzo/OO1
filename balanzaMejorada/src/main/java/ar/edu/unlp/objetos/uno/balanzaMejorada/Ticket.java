package ar.edu.unlp.objetos.uno.balanzaMejorada;

import java.time.LocalDate;
import java.util.LinkedList;

public class Ticket {
	private LocalDate fecha;
	public LinkedList<Producto> productos; 
	
	
	
	public Ticket(LinkedList<Producto>lis) {
		
		this.fecha = LocalDate.now();
		this.productos = lis;	
	}
	
	
	public double impuesto() {
		
		double imp = this.calcularTotal() * 0.21;
		return imp;
		
	}

	public double calcularTotal() {
		
		double total = 0;
		for(Producto p : productos) {
			total = total + p.getPrecio();
		}
		
		return total;
	}
	
	

	public LocalDate getFecha() {
		return fecha;
	}


	public LinkedList<Producto> getProductos() {
		return productos;
	}
	

	
}
