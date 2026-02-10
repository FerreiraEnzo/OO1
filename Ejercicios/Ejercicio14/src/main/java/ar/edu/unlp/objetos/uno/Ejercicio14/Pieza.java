package ar.edu.unlp.objetos.uno.Ejercicio14;


public abstract class Pieza {
	private String material;
	private String color;
	private double superficieExterior;
	private double volumen;
	
	
	public Pieza(String unMaterial,String unColor,double superficie,double unVolumen) {
		
		this.material = unMaterial;
		this.color = unColor;
		this.superficieExterior = superficie;
		this.volumen = unVolumen;
	}
	
	
	public abstract double calcularVolumen();
	
	public abstract double calcularSuperficie();
	
	public boolean verificarMaterial(String mat) {
		
		return this.material.equals(mat);
	}


	public boolean verificarColor(String unColor) {
		
		return this.color.equals(unColor);
	}


		
	
	
	
	
	
	

}
