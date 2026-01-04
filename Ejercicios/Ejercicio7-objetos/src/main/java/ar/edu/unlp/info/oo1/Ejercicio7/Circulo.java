package ar.edu.unlp.info.oo1.Ejercicio7;

public class Circulo implements Figura{
	private double diametro;

	
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getRadio() {
		
		return this.diametro / 2;
	}
	
	public void setRadio(double valor) {
		
		this.setDiametro(valor * 2);
	}
	
	
	public double getPerimetro() {
		
		return Math.PI * diametro;
	}
	
	public double getArea() {
		
		double radio = this.getRadio() * this.getRadio();
		return Math.PI * radio;
		
	}
	
	
	
	
	

}
