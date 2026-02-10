package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.time.LocalDate;

public abstract class Actividad {
	private LocalDate fechaInicio;
	private String direccionIP;
	protected int duracionTotal;
	
	
	public Actividad(LocalDate fecha, String direccion, int duracion) {
		this.fechaInicio = fecha;
		this.direccionIP = direccion;
		this.duracionTotal = duracion;
	}
	
	
	public abstract double montoACobrar();
		
	
	public boolean estaEnRango(LocalDate inicio, LocalDate fin) {
		return !this.fechaInicio.isBefore(inicio) && !this.fechaInicio.isAfter(fin);
	}

	public String getDireccionIP() {
		return this.direccionIP;
	}
	
}
