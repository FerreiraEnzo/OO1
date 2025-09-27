package ar.edu.unlp.objetos.uno.Ejercicio6;

public class Consumo {
	private double consumoActivo;
	private double consumoReactivo;
	
	
	
	public double calcularCostoActivo(CuadroTarifario c) {
		
		double costo = this.consumoActivo * c.getPreciokWh();
		return costo;
	}
	
	public boolean determinarFpe() {
		
		return (this.consumoReactivo > 0.8);
			
	}
	
	
	
}
