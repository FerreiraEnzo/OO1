package ar.edu.unlp.objetos.uno.Ejercicio14;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(double unRadio,String unMaterial,String unColor,double superficie,double unVolumen) {
		
		super(unMaterial,unColor,superficie,unVolumen);
		this.radio = unRadio;		
	}
	
	public double calcularVolumen() {
		
		return (4/3 * Math.PI * Math.pow(radio, 2));
		
	}
	
	public double calcularSuperficie() {
		
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
	

}
