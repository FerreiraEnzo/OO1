package ar.edu.unlp.objetos.uno.Ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo(Carpeta inbox) {	
		carpetas = new LinkedList<Carpeta>();
		this.inbox = inbox;
		carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.agregarMail(email);
	}
	
	public Email buscar(String texto) {
		
		return carpetas.stream()
				.map(carpeta -> carpeta.buscar(texto))
				.findFirst().orElse(null);
		
	}
	
	public int espacioOcupado() {
		
		return carpetas.stream().mapToInt(c -> c.calcularTamaño()).sum();
		
		
	}
	
	
	
	
	

}
