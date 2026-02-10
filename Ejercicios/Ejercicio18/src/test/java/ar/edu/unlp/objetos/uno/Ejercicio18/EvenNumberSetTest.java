package ar.edu.unlp.objetos.uno.Ejercicio18;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenNumberSetTest {
	EvenNumberSet<Integer> set;
	
	
	
	@BeforeEach
	void setUp() {
		set = new EvenNumberSet<Integer>();
	}
	
	
	
	@Test
	void testAdd() {
		
		set.add(2);
		set.add(1);
		assertTrue(set.contains(2));
		assertFalse(set.contains(1));
		//duplicados
		assertFalse(set.add(2));
	}
	

}
