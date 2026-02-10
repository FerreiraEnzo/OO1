package ar.edu.unlp.objetos.uno.Ejercicio29;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private String nombre;
	private LocalDate fechaAlta;
	private Plan plan;
	
	
	public Cliente(String name, Plan unPlan) {
		this.nombre = name;
		this.fechaAlta = LocalDate.now();
		this.plan = unPlan;
	}
		
	
	public void cambiarPlan(Plan unPlan) {
		this.plan = unPlan;
	}
	
	public double montoTotal(LocalDate fechaInicio, LocalDate fechaFin) {
		
		return plan.calcularPrecioBase() + plan.calcularMontoActividades(fechaInicio,fechaFin) + 
				plan.calcularMontoPenalizacion(this.cumpleAntiguedad());
	}
	
	public boolean cumpleAntiguedad() {
		return Period.between(fechaAlta, LocalDate.now()).getYears() > 10;
	}
	
	

}
