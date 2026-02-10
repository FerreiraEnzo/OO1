package ar.edu.unlp.objetos.uno.Ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fecha;
	private double montoDepositado;
	private double porcentajeInteres;
	
	
	public PlazoFijo(LocalDate unaFecha,double unMonto,double porcentaje) {
		
		this.fecha = unaFecha;
		this.montoDepositado = unMonto;
		this.porcentajeInteres = porcentaje;
	}
	
	
	
	
	
	@Override
	public double calcularValorActual() {
		
		long cantidadDias = ChronoUnit.DAYS.between(this.fecha, LocalDate.now());
		double valor = cantidadDias * this.porcentajeInteres;
		valor = valor + this.montoDepositado;
		
		return valor;
		
	}
	

}
