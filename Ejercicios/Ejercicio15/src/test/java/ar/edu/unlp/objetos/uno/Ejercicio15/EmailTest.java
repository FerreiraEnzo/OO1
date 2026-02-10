package ar.edu.unlp.objetos.uno.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	private Email email1,email2;
	private Archivo archivo1,archivo2;
	
	
	@BeforeEach
	void setUp() {
		
		email1 = new Email("Comunicado", "ProbandoTest");
		email2 = new Email("", "");
		archivo1 = new Archivo("File1");
		archivo2 = new Archivo("file2");
		email1.agregarArchivo(archivo1);
		email1.agregarArchivo(archivo2);
	}
	
	
	@Test
	void testTamaño() {
		assertEquals(42, email1.calcularTamaño());
		assertEquals(0, email2);
	}
	
	@Test
	void testVerificar() {
		
		assertTrue(email1.verificar("Comunicado"));
		assertFalse(email1.verificar("Karaoke"));
		
		assertTrue(email2.verificar(""));
		assertFalse(email2.verificar("Casa"));		
	}
	
	
}
