package ar.edu.unlp.objetos.uno.Ejercicio5;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
	private String name;
	private List<Inversion> cartera;
	
	
	public Inversor(String name) {
		this.name = name;
		this.cartera = new LinkedList<Inversion>();
	}
	
		
	public double valorInversiones() {
		
		double valor = 0;
		for(Inversion i : cartera) {
			valor += i.calcularValorActual();
		}
		
		return valor;
		
	}
	
	public void agregarInversion(Inversion unaInversion) {
		this.cartera.add(unaInversion);
	}
	
	
	
}
