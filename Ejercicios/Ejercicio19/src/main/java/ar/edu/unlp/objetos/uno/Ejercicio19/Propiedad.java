package ar.edu.unlp.objetos.uno.Ejercicio19;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;

public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	private double precioNoche;
	private List<Reserva> reservas;		//Historial de reservas de esta propiedad
	
	
	public Propiedad(String dire, String name, double precio) {
		
		this.direccion = dire;
		this.nombreDescriptivo = name;
		this.precioNoche = precio;
		this.reservas = new LinkedList<Reserva>();
	}
	
	
	public boolean consultarDisponibilidad(DateLapse date) {
		
		return reservas.stream().noneMatch(r -> r.contienePeriodo(date)); 
		
	}
	
	
	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
		
	}
	
	public double getPrecioPorNoche() {
		return this.precioNoche;
	}
	
	public void eliminarReserva(Reserva r) {
		
		this.reservas.remove(r);
	}
	
	
	public double calcularMonto(DateLapse periodo) {
		
		return reservas.stream().filter(r -> r.contienePeriodo(periodo))
				.mapToDouble(r -> r.calcularPrecioReserva())
				.sum();
		
	}
	

}
