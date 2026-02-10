package ar.edu.unlp.objetos.uno.Ejercicio21;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean EntregaRapida;
	private double costoFijo = 1000;
	private double costoAdicional = 500;
	
	
	public EnvioLocal(LocalDate fecha, String origen, String destino,double peso, 
						boolean entregaRapida) {
		super(fecha, origen, destino,peso);
		this.EntregaRapida = entregaRapida;
	}
	
	
	public double calcularMontoEnvio() {
	
		if(this.EntregaRapida) {
			return this.costoFijo + this.costoAdicional;
		}
			
		return this.costoFijo;
		
	}
	

}
