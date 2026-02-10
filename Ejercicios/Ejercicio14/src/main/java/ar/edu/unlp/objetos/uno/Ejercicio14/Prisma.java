package ar.edu.unlp.objetos.uno.Ejercicio14;

public class Prisma extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	
	public Prisma(double unLadoMayor,double unLadoMenor,double unaAltura,String unMaterial,String unColor,double superficie,double unVolumen) {
		
		super(unMaterial,unColor,superficie,unVolumen);
		this.ladoMayor = unLadoMayor;
		this.ladoMayor = unLadoMenor;
		this.altura = unaAltura;
		
	}
	
	
	public double calcularVolumen() {
		
		return this.ladoMayor * this.ladoMayor * this.altura;
	}
	
	public double calcularSuperficie() {
		
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor 
					* this.altura + this.ladoMenor * this.altura);
		
	}
	
	
}
