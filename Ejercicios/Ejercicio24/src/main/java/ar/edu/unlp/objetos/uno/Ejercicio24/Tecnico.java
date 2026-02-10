package ar.edu.unlp.objetos.uno.Ejercicio24;

public class Tecnico {
	private String nombreCompleto;
	private String especialidad;
	private double valorHora;
	
	
	public Tecnico(String name, String especialidad, double valor) {
		this.nombreCompleto = name;
		this.especialidad = especialidad;
		this.valorHora = valor;
	}
	
	public double getValorHora() {
		return this.valorHora;
	}
	
	
	

}
