package ar.edu.unlp.objetos.uno.Ejercicio6;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String name;
	private String domicilio;
	private List<Consumo> consumos;
	
	
	public Usuario(String name, String domicilio) {
		this.name = name;
		this.domicilio = domicilio;
		this.consumos = new LinkedList<Consumo>();
	}
	
	
	public Factura emitirFactura() {
		
		Factura f = new Factura(this);
		f.calcular(consumos.getLast());
		return f;
		
	}
	
	
	
	

}
