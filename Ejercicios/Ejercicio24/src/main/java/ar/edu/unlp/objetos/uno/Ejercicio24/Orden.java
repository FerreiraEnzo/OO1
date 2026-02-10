package ar.edu.unlp.objetos.uno.Ejercicio24;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public abstract class Orden {
	private LocalDate fecha;
	private Usuario usuario;
	private String domicilio;
	protected List<Producto> productos;
	
	
	public Orden(LocalDate unaFecha, Usuario usuario, String domicilio) {
		this.fecha = unaFecha;
		this.usuario = usuario;
		this.domicilio = domicilio;
		this.productos = new LinkedList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	
	public abstract double calcularCosto();
	

}
