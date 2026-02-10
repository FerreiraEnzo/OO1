package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Plan {
	private int cantidadLimiteIPs;
	protected List<Actividad> actividades;
	
	
	public Plan(int cantidad) {
		this.cantidadLimiteIPs = cantidad;
		this.actividades = new ArrayList<Actividad>();
	}
	
	public void agregarActividad(Actividad actividad) {
		this.actividades.add(actividad);
	}
	

	public double calcularMontoActividades(LocalDate inicio,LocalDate fin) {
		
		return this.actividades.stream().filter(a -> a.estaEnRango(inicio,fin))
				.mapToDouble(a -> a.montoACobrar()).sum();
	}
	
	public int getCantidadLimiteIPs() {
		return this.cantidadLimiteIPs;
	}
	
	
	public abstract double calcularPrecioBase();
	
	public abstract double calcularMontoPenalizacion(boolean cumple);
	

}
