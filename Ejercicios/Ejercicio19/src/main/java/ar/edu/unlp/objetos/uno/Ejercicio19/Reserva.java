package ar.edu.unlp.objetos.uno.Ejercicio19;

import java.time.LocalDate;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;

public class Reserva {
	private DateLapse periodo;
	private int cantidadNoches;
	private Propiedad propiedad;
	
	
	
	public Reserva(DateLapse p, int cantNoches, Propiedad prop) {
		
		this.periodo = p;
		this.cantidadNoches = cantNoches;
		this.propiedad = prop;
	}
	
		
	public double calcularPrecioReserva() {
		
		return this.cantidadNoches * propiedad.getPrecioPorNoche();
	}

	
	public boolean contienePeriodo(DateLapse other) {
		
		return periodo.overLaps(other);
		
	}
	
	public boolean cancelarReserva() {
		
		if(!this.estaEnCurso()) {
			propiedad.eliminarReserva(this);
			return true;
		}
		
		return false;
	}
	
	public boolean estaEnCurso() {
		
		return LocalDate.now().isBefore(this.periodo.getFrom());
	}
	
	

	
}
