package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoPresencial extends Evento{
	public List<Sede> sedes;
	
	
	public EventoPresencial(String name, LocalDate unaFecha, String tema, 
							double precioInscripcion, double precioRemera) {
		
		super(name, unaFecha, tema, precioInscripcion, precioRemera);
		this.sedes = new ArrayList<Sede>();
	}
	
	public void agregarSede(Sede unaSede) {
		this.sedes.add(unaSede);
	}
	
	public double calcularPrecio() {
		
		return this.sedes.stream().mapToDouble(s -> s.calcularMonto()).sum();
		
		
		
	}

}
