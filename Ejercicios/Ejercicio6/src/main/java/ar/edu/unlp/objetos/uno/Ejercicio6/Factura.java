package ar.edu.unlp.objetos.uno.Ejercicio6;

import java.time.LocalDate;

public class Factura {
	private Usuario cliente;
	private LocalDate fecha;
	private double bonificacion;
	private double montoFinal;
	
	
	public Factura(Usuario usu) {
		this.cliente = usu;	
		this.fecha = LocalDate.now();
		this.bonificacion = 0;
		this.montoFinal = 0;
	}
	
	public void calcular(Consumo unConsumo) {
		
		
		CuadroTarifario c = new CuadroTarifario();
		double costoActivo = unConsumo.calcularCostoActivo(c);
		
		if(unConsumo.determinarFpe()) {
			this.bonificacion = 0.10;
			costoActivo = costoActivo - (costoActivo * this.bonificacion); 
		}
		
		
		this.montoFinal = costoActivo;
		
		}
		
		
	}
	
	
	
	
	
	
	


