package ar.edu.unlp.objetos.uno.Ejercicio24;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombreCompleto;
	private String domicilio;
	private List<Orden> ordenes;
	
	
	public Usuario(String name, String unDomicilio) {
		this.nombreCompleto = name;
		this.domicilio = unDomicilio;
		this.ordenes = new LinkedList<Orden>();
	}
	
	
	public void agregarOrden(Orden orden) {
		this.ordenes.add(orden);
	}
	
	
	public List<Orden> getOrdenes(){
		return new LinkedList<Orden>(this.ordenes);
	}
	

}
