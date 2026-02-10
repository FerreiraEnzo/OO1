package ar.edu.unlp.objetos.uno.Ejercicio24;

import java.time.LocalDate;

public class OrdenCompra extends Orden{
	private double precioEnvio;

	
	public OrdenCompra(LocalDate fecha, Usuario usuario, String domicilio, double precio) {
		super(fecha,usuario,domicilio);
		this.precioEnvio = precio;
		//usuario.agregarOrden(this);
	}
	
	
	public boolean cumpleCondicion() {
		
		return this.productos.size() >= 5;
		
	}
	
	public double calcularCosto() {
		double costo = this.productos.stream().mapToDouble(p -> p.getCosto()).sum();
		
		if(this.productos.size() > 5)
			return costo * 0.9;
		
		return costo;
		
		}
		
	

		
	}
	
	

