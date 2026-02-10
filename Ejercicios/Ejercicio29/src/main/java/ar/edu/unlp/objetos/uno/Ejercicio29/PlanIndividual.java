package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.util.stream.Collectors;

public class PlanIndividual extends Plan{
	private int minutosContratados;
	
	
	public PlanIndividual(int minutos) {
		super(1);
		this.minutosContratados = minutos;
	}
	
	
	
	public double base() {
		return 20;
	}
	
	public double calcularPrecioBase() {
		return this.minutosContratados * this.base();
	}


	public double calcularMontoPenalizacion(boolean cumple) {
		
		double monto = 0;
		int cantidadIPs = this.actividades.stream()
						.map(a -> a.getDireccionIP())
						.collect(Collectors.toSet())
						.size();
		
		if(cantidadIPs > 1) {
			return monto += cantidadIPs * 300;
		}
		
		return monto;
			
	}
	
	
	
}
