package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.util.LinkedList;
import java.util.List;


public class Carpeta {
	private List<Email> emails;
	private String nombre; 
	
	
	
	public Carpeta(String name) {
		this.nombre = name;
		this.emails = new LinkedList<Email>();
	}
	

	public String getNombre() {
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) {
		
		destino.agregarMail(email);
		emails.remove(email);
	}
	
	public void agregarMail(Email email) {
		this.emails.add(email);
	}
	
	
	public Email buscar(String texto) {
		
		return emails.stream()
				.filter(e -> e.verificar(texto))
				.findFirst().orElse(null);
		
	}
	
	public int calcularTamaño() {
		
		return this.emails.stream().mapToInt(e -> e.calcularTamaño()).sum();
		
	}
	
	public void eliminarMail(Email email) {
		this.emails.remove(email);
	}
	
}
