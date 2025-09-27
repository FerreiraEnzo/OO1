package ar.edu.unlp.objetos.uno.balanzaMejorada;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	
	public Producto(String desc,double peso,int precio) {
		
		this.setDescripcion(desc);
		this.setPeso(peso);
		this.setPrecioPorKilo(precio);
		
	}
	
	
	public double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPrecioPorKilo() {
		return precioPorKilo;
	}


	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public double getPrecio() {
		
		double precio = this.getPeso() * this.getPrecioPorKilo();
		return precio;
	
	}
	
	

}
