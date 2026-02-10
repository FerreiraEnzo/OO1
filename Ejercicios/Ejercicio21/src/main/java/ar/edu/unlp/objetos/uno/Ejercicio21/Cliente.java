package ar.edu.unlp.objetos.uno.Ejercicio21;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	
	public Cliente(String name, String direccion) {
		
		this.nombre = name;
		this.direccion = direccion;
		this.envios = new LinkedList<Envio>();
	}
	
	
	public void agregarEnvio(Envio unEnvio) {
		this.envios.add(unEnvio);
	}
	
	public double calcularMonto(DateLapse periodo) {
		
		return envios.stream().
				filter(e -> e.estaEnRango(periodo)).
				mapToDouble(e -> this.calcularMontoConDescuento(e.calcularMontoEnvio())).sum();
	}
	

	
	public abstract double calcularMontoConDescuento(double precio);
		

	
}
