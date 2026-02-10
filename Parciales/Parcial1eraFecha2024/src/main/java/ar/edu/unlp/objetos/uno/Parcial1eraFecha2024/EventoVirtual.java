package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	
	public EventoVirtual(String name, LocalDate unaFecha, String tema, 
							double precioInscripcion, double precioRemera) {
		
		super(name, unaFecha, tema, precioInscripcion, precioRemera);
	}
	
	public double getMontoFijo() {
		
		return 1000;
	}
	
	public double calcularPrecio() {
		return this.getMontoFijo();
	}
	
	

}
