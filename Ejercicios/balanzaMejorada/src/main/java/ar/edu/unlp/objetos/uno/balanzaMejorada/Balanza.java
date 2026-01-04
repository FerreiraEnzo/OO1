package ar.edu.unlp.objetos.uno.balanzaMejorada;

import java.util.LinkedList;


public class Balanza {
	private LinkedList<Producto> productos;
	
	
	public Balanza() {
		this.productos = new LinkedList<Producto>();
	}


	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto produc) {
		this.productos.add(produc);
	}
	
	public LinkedList<Producto> getProductos() {
		return productos;
	}
	
	public Ticket emitirTicket() {
		
		Ticket t = new Ticket(this.productos);
		
		return t;
		
	}

	



}
