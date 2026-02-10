package ar.edu.unlp.objetos.uno.Ejercicio21;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private double distanciaKm;
	private double costoMenor100km = 20;
	private double costoEntre100y500 = 25;
	private double costoMayor500km = 30;
	
	
	
	public EnvioInterurbano(LocalDate fecha, String origen, String destino, double peso,
								double distancia) {
		
		super(fecha, origen, destino, peso);
		this.distanciaKm = distancia;
	}
	
	
	public double calcularMontoEnvio() {
		
		if(this.distanciaKm < 100) {
			return this.costoMenor100km * this.getPesoEnGramos();
		}else {
			if(this.distanciaKm >= 100 && this.distanciaKm<= 500) {
				return this.costoEntre100y500 * this.getPesoEnGramos();
			}
		}
		
		return this.costoMayor500km * this.getPesoEnGramos();
	}
	

}
