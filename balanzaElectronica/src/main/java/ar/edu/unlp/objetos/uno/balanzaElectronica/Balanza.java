package ar.edu.unlp.objetos.uno.balanzaElectronica;


public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}


	public double getPrecioTotal() {
		return this.precioTotal;
	}

	

	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto produc) {
		this.cantidadDeProductos++;
		this.precioTotal += produc.getPrecio();
		this.pesoTotal += produc.getPeso();
		
	}
	
	public Ticket emitirTicket() {
		
		Ticket t = new Ticket(this.getCantidadDeProductos(),this.getPrecioTotal(),
								this.getPesoTotal());
		
		return t;
		
		
	}

	



}
