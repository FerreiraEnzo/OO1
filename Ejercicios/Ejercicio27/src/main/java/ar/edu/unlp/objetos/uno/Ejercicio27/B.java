package ar.edu.unlp.objetos.uno.Ejercicio27;

public class B extends A{

	
	public String m1() {
		return "B.M1" + this.m2();
	}
	
	public String m2() {
		return "B.M2" + super.m2();
	}
	
	public String m3() {
		return "B.M3" + super.m3() + this.m2();
	}
	
	
	
}
