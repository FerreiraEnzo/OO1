package ar.edu.unlp.objetos.uno.Ejercicio19;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;


public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> propiedades;
	
	
	public Usuario(String name, String dire, int documento) {
		
		this.nombre = name;
		this.direccion = dire;
		this.DNI = documento;
		this.propiedades = new LinkedList<Propiedad>();
	}
	
	
	public void agregarPropiedad(Propiedad p1) {
		
		this.propiedades.add(p1);
	}
	
	
	public double calcularIngresos(DateLapse periodo) {
		
		return propiedades.stream().mapToDouble(p -> p.calcularMonto(periodo))
				.sum() 
				* 0.75;
		
	}
	
	public boolean reservar(DateLapse periodo, Propiedad propiedad) {
		
		if(propiedad.consultarDisponibilidad(periodo)) {
			Reserva r = new Reserva(periodo, periodo.sizeInDaysV2(), propiedad);
			propiedad.agregarReserva(r);
			return true;
		}
		
		return false;
	}
	
	
	
	
	
}
