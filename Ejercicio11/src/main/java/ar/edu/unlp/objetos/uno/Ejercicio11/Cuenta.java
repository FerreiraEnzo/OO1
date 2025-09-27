package ar.edu.unlp.objetos.uno.Ejercicio11;


public abstract class Cuenta {
	private double saldo;
	
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		
		this.saldo -= monto;
	}
	
	
	public boolean extraer(double monto) {
		
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(this.calcular(monto));
			return true;			
		}
		return false;
	}
		
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		
		double montoConImpuesto = this.calcular(monto);
		
		
		if(this.puedeExtraer(montoConImpuesto)) {
			this.extraerSinControlar(montoConImpuesto);
			cuentaDestino.depositar(montoConImpuesto);
			return true;
		}
		
		return false;
		
	}
	
	
	protected abstract double calcular(double monto);		
	
	
	protected abstract boolean puedeExtraer(double monto);	
		
	
	
	
	
	
	
	}
	


