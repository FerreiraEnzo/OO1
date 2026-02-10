package ar.edu.unlp.objetos.uno.Ejercicio21;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	private boolean EntregaVeloz;
	private double costoFijo = 5000;
	private double costoHasta1kg = 10;
	private double costoMayor1kg = 12;
	private double costoAdicional = 800;
	
	
	public EnvioInternacional(LocalDate fecha, String origen, String destino,
								double peso, boolean entrega) {
		
		super(fecha, origen, destino, peso);
		this.EntregaVeloz = entrega;
	}
	
	
	public double calcularMontoEnvio() {
		
		double peso = this.getPesoEnGramos();
		double monto;
		
		if(this.EntregaVeloz) {
			if(peso <= 1000) {
				monto = this.costoFijo + this.costoHasta1kg * peso + this.costoAdicional;
			}else {
				monto =  this.costoFijo + this.costoMayor1kg * peso + this.costoAdicional;
			}
		}else {
			if(peso <= 1000)
				monto =  this.costoAdicional + this.costoHasta1kg * peso;
			else {
				monto = this.costoAdicional + this.costoMayor1kg * peso;
			}
		}
			
		return monto;
		
	}
	
	
	

}
