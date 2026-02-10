package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.util.stream.Collectors;

public class PlanGrupal extends Plan{
	
	
	
	public PlanGrupal(int cantidad) {
		super(cantidad);
	}
	
	public double base() {
		return 800;
	}
	
	public double calcularPrecioBase() {
		return this.getCantidadLimiteIPs() * this.base();
	}
	
	public double calcularMontoPenalizacion(boolean cumple) {
		
		double monto = 0;
		int cantIPs = this.actividades.stream()
				.map(a -> a.getDireccionIP())
				.collect(Collectors.toSet())
				.size();

		if(cantIPs > this.getCantidadLimiteIPs()) {
			return monto += cantIPs * 500;
		}
		
		return monto;
	}
	

}
