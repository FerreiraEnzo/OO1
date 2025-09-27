package ar.edu.unlp.objetos.uno.Ejercicio11;


public class CajaDeAhorro extends Cuenta{

	
		
	protected boolean puedeExtraer(double unMonto) {
			
		return (this.getSaldo() >= unMonto);	
		
	}
	
	protected double calcular(double unMonto) {
		
		return unMonto *1.02;
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
}