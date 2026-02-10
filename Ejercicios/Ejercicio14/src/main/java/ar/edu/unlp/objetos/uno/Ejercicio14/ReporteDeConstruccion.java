package ar.edu.unlp.objetos.uno.Ejercicio14;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	
	public ReporteDeConstruccion() {
		this.piezas = new LinkedList<Pieza>();
	}
	
	public void agregarPieza(Pieza unaPieza) {
		this.piezas.add(unaPieza);
	}
	
	public double volumenDeMaterial(String material) {
		
		return piezas.stream()
				.filter(p -> p.verificarMaterial(material))
				.mapToDouble(p -> p.calcularVolumen()).sum();
		
	}
	
	public double superficieDeColor(String color) {
		
		return piezas.stream()
				.filter(p -> p.verificarColor(color))
				.mapToDouble(p -> p.calcularSuperficie()).sum();
		
	}
	
	
}
