package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.objetos.uno.Ejercicio16.DateLapse;

public class Usuario {
	private String nombre;
	List<Entrada> entradas;
	
	
	public Usuario(String name) {
		this.nombre = name;
		this.entradas = new ArrayList<Entrada>();
	}
	
	
	public Entrada comprarEntrada(Evento e, boolean seguro) {
		Entrada e1 = new Entrada(e,seguro);
		this.entradas.add(e1);
		return e1;
	}
	
	
	public double precioEvento(Evento e) {
		return e.calcularPrecio();
	}
	
	
	public double montoEnPeriodo(DateLapse fechas) {

		return this.entradas.stream().filter(e -> e.estaEnRango(fechas))
				.mapToDouble(e -> e.calcularPrecio())
				.sum();		
		
	}
	
	public Entrada masCercana() {
		
		 return this.entradas.stream()
	                .filter(entrada -> entrada.esPosterior())
	                .min((e1, e2) -> e1.getfechaCompra().compareTo(e2.getfechaCompra()))
	                .orElse(null);
    }
	
	
	}
		
		
	


