package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.time.LocalDate;

public class ReproduccionVideo extends Actividad{
	private int duracionPublicidad;
	
	
	
	public ReproduccionVideo(LocalDate fecha, String direccion, int duracion, int publicidad) {
		super(fecha, direccion, duracion);
		this.duracionPublicidad = publicidad;
		
	}
	
	public double montoACobrar() {
		return (this.duracionTotal - duracionPublicidad) * 10;
	}
	
	
}
