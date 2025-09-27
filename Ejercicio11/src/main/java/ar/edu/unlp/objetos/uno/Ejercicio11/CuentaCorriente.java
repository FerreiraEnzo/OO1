package ar.edu.unlp.objetos.uno.Ejercicio11;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;


	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}
	
	
	
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
	
	protected boolean puedeExtraer(double unMonto) {
		
		
		return(this.getSaldo() + limiteDescubierto >= unMonto);		
			
		
	}
	
	
	protected double calcular(double unMonto) {
		
		return unMonto;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
