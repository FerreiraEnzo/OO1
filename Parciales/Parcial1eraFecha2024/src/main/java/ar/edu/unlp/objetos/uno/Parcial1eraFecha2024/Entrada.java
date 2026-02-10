package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;

public class Entrada {
	private boolean seguro;
	private Evento evento;
	private LocalDate fechaCompra;
	
	
	public Entrada(Evento e, boolean seguro) {
		this.evento = e;
		this.seguro = seguro;
		this.fechaCompra = LocalDate.now();
	}
	
	
	public double montoARecuperar() {
		double monto = this.evento.calcularMontoARecuperar(this.fechaCompra,this.seguro);
		return monto;
	}
	
	
	public boolean estaEnRango(DateLapse fechas) {
		return fechas.includesDate(fechaCompra);	
	}
	
	
	public double calcularPrecio() {
		return this.evento.calcularPrecioAsistencia();
	}
	
	public boolean esPosterior() {
		int dias = Period.between(fechaCompra, this.evento.getFecha()).getDays();
		return dias >= 1;
	}
	
	public LocalDate getfechaCompra() {
		return this.fechaCompra;
	}

	
	
}
