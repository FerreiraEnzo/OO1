package ar.edu.unlp.objetos.uno.Ejercicio24;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class OrdenServicio extends Orden{
	private String descripcion;
	private int horas;
	private List<Tecnico> tecnicos;
	
	public OrdenServicio(LocalDate fecha, Usuario usuario,String domicilio, String desc, int horas) {
		super(fecha,usuario,domicilio);
		this.descripcion = desc;
		this.horas = horas;
		this.tecnicos = new LinkedList<Tecnico>();
	}
	
	public void agregarTecnico(Tecnico tecnico) {
		this.tecnicos.add(tecnico);
	}
	
	
	public boolean cumple() {
		return this.horas > 10;
	}
	
	public double calcularCosto() {
		
		double costo = this.productos.stream().mapToDouble(p -> p.getCosto()).sum() + 
				this.tecnicos.stream().mapToDouble(t -> t.getValorHora() * this.horas).sum();
		
		if(this.horas > 10)
			return costo * 0.9;
		
		return costo;
	}
	

	
}
