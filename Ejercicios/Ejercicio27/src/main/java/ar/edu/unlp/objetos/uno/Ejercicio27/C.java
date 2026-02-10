package ar.edu.unlp.objetos.uno.Ejercicio27;

public class C extends B{
	
	
	public String m1() {
		return "C.M1" + super.m1();	
	}
	
	public String m2() {
		return "C.M2";
	}
	
	public String m3() {
		return super.m3() + "C.M3";
	}
	

}
