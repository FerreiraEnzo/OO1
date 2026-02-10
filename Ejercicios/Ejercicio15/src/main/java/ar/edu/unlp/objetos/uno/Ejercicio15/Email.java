package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	
	public Email(String title, String body) {
		
		this.titulo = title;
		this.cuerpo = body;
		this.adjuntos = new LinkedList<Archivo>(); 
		
	}
	
	public int calcularTamaño() {
		
		return titulo.length() + cuerpo.length() + 
				adjuntos.stream()
				.mapToInt(a -> a.tamaño()).sum();
		
	}
	
	public boolean verificar(String texto) {
		
		return this.titulo.contains(texto) || this.cuerpo.contains(texto);
		
	}
	
	public void agregarArchivo(Archivo file) {
		
		this.adjuntos.add(file);
		
	}
	
	
}

