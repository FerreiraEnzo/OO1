package ar.edu.unlp.objetos.uno.Ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private LinkedList<Item> listadoItems;
	
	
	public Presupuesto(String cli) {
		
		this.fecha = LocalDate.now();
		this.cliente = cli;
		this.listadoItems = new LinkedList<Item>();		
		
	}
	
	
	
	public void agregarItem(Item it) {
		this.listadoItems.add(it);
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}


	public String getCliente() {
		return cliente;
	}



	public double calcularTotal() {
		
		double total = 0;
		for(Item i : listadoItems) {
			total = total + i.costo();
		}
		
		return total;
	}
	
	public double calcularTotalV2() {
		
		return listadoItems.stream().mapToDouble(i->i.costo()).sum();
		
	}
	
	
	

}

