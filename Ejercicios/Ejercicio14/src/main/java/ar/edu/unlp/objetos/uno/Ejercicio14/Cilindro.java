package ar.edu.unlp.objetos.uno.Ejercicio14;

public class Cilindro extends Pieza{
	private double radio;
	private double altura;
	
	
	
	public Cilindro(double unRadio, double unaAltura,String unMaterial,String unColor,double superficie,double unVolumen) {
		
		super(unMaterial,unColor,superficie,unVolumen);
		this.radio = unRadio;
		this.altura = unaAltura;
	}
	
	
	public double calcularVolumen() {
		
		return Math.PI * (Math.pow(radio, 2)) * altura;
		
	}
	
	public double calcularSuperficie() {
		
		return 2 * Math.PI * altura + 2 * Math.PI * Math.pow(radio, 2);
		
	}
	
	
	
	
	

}
