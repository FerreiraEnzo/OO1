package ar.edu.unlp.objetos.uno.Ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	
	protected InversionEnAcciones inversionUno; 
	protected PlazoFijo inversionDos;
	
	
	private void initializeInversiones() {
		
		inversionUno = new InversionEnAcciones("YPF",5,10);
		inversionDos = new PlazoFijo(LocalDate.now(),20000,5);
	
	}
	
	
	@BeforeEach
	void setUp() {
		initializeInversiones();
	}
	
	private Inversor newInversor() {
		
		Inversor warrenBuffet = new Inversor("Warren Buffett");
		return warrenBuffet;
	}
	

	@Test
	void testAddInversion() {
		
		Inversor steveJobs = new Inversor("Steve Jobs");
		steveJobs.agregarInversion(inversionDos);
		assertTrue(steveJobs.getCartera().contains(inversionDos));
		
				//LO DEBERIA HACER CON EL OTRO TIPO DE INVERSION TAMBIEN? 
				//NO CONTROLO LA CANTIDAD? SOLAMENTE QUE CONTENGA LO QUE AGREGO?
	}
	
	@Test
	void testValorInversion() {
		
		Inversor timCook = new Inversor("Tim Cook");
		timCook.agregarInversion(inversionUno);
		assertEquals(timCook.valorInversiones(), inversionUno.calcularValorActual());
		
		
	}
	

}
