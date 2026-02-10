package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SesionDeJuego extends Actividad{
	private List<Item> items;
	
	
	public SesionDeJuego(LocalDate fecha, String direccion, int duracion) {
		super(fecha, direccion, duracion);
		this.items = new ArrayList<Item>();
	}
	
	
	public double montoACobrar() {
		
		double monto = 0;
		
		if(this.duracionTotal > 360) {
			monto = items.stream().mapToDouble(i -> i.precioFinal()).sum();
		}
			
		return monto;
	}

}
