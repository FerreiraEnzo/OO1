package ar.edu.unlp.objetos.uno.Ejercicio18;

import java.util.HashSet;
import java.util.Set;

public class EvenNumberSet<Integer> extends HashSet<Integer>{
	
	
	public boolean add(Integer num) {
		
		if((int)num % 2 == 0) {
			return super.add(num);
		}else {
			return false;
		}
		
	}
	
	
	
	

}
