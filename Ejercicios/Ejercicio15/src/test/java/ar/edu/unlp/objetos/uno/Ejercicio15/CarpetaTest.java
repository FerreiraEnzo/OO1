package ar.edu.unlp.objetos.uno.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta1,carpeta2;
	private Email email1,email2;
	
	
	
	@BeforeEach
	void setUp() {
		
		carpeta1 = new Carpeta("Prueba1");
		carpeta2 = new Carpeta("prueba2");
		
		email1 = new Email("informe", "comunicado");
		email2 = new Email("Reporte", "información");
		
		carpeta1.agregarMail(email1);
		carpeta1.agregarMail(email2);	
	}
	
	
	@Test 
	void testBuscar() {
		
		assertNotNull(carpeta1.buscar("Informe"));
		assertNull(carpeta1.buscar(""));
	}
	
	@Test
	void testTamaño() {
		assertEquals(47, carpeta1.calcularTamaño());
		carpeta1.eliminarMail(email1);
		carpeta2.eliminarMail(email2);
		assertEquals(0, carpeta1.calcularTamaño());
	}
	
	@Test
	void testMover() {
		
		carpeta1.mover(email1, carpeta2);
		assertNotNull(carpeta2.buscar("Informe"));
		assertNull(carpeta1.buscar("Informe"));
	}
	

}
