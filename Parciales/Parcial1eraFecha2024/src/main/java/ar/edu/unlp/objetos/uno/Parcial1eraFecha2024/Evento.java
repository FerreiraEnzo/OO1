package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

import java.time.LocalDate;
import java.time.Period;

public abstract class Evento {
	private String nombre;
	private LocalDate fecha;
	private String temaPrincipal;
	private double precioInscripcion;
	private double precioRemera;
	
	
	
	public Evento(String name, LocalDate unaFecha, String tema, 
					double precioInscripcion, double precioRemera) {
		this.nombre = name;
		this.fecha = unaFecha;
		this.temaPrincipal = tema;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}
	
	

	public double calcularPrecioAsistencia() {
		
		if(LocalDate.now().isEqual(fecha)) {
			return (this.precioInscripcion * 1.20) + (this.precioRemera + this.calcularPrecio()); 
		}
		
		return this.precioInscripcion + this.precioRemera + this.calcularPrecio();
	}
		
	public double calcularMontoARecuperar(LocalDate fechaEntrada,boolean seguro) {
		
		double monto = 0;
		int diferencia = Period.between(fechaEntrada, fecha).getDays();
		
		if(diferencia >= 30) {
			monto += this.calcularPrecioAsistencia() * 1.50;
		}
		
		if(seguro) {
			monto += this.calcularPrecioAsistencia() * 1.15;
		}
		
		return monto;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract double calcularPrecio();

	
	
	
}
