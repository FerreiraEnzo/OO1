package ar.edu.unlp.objetos.uno.Ejercicio21;

import java.time.LocalDate;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	private double pesoEnGramos;
	
	
	public Envio(LocalDate fecha, String origen, String destino, double peso) {
		this.fechaDespacho = fecha;
		this.direccionOrigen = origen;
		this.direccionDestino = destino;
		this.pesoEnGramos = peso;
	}
	

	public boolean estaEnRango(DateLapse periodo) {
		return periodo.includesDate(fechaDespacho);
	}
	
	
	public double getPesoEnGramos() {
		return this.pesoEnGramos;
	}
	
	public abstract double calcularMontoEnvio();
	
	

}
