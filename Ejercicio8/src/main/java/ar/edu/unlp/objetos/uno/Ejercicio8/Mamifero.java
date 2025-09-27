package ar.edu.unlp.objetos.uno.Ejercicio8;

import java.time.LocalDate;


public class Mamifero {
	private String identificador;
	private Mamifero padre;
	private Mamifero madre;
	private String especie;
	private LocalDate fechaNacimiento;
	
	
	public Mamifero(String name) {
		
		identificador = name;
	}
	
	public Mamifero() {
		
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public Mamifero getAbueloMaterno() {
		
		return (this.getMadre() != null) ? this.getMadre().getPadre() : null;
	}
		
	public Mamifero getAbueloPaterno() {
		
		return (this.getPadre() != null) ? this.getPadre().getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		
		return (this.getMadre() != null) ? this.getMadre().getMadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		
		return (this.getPadre() != null) ? this.getPadre().getMadre() : null;
		
	}
	
	public boolean tienePadre () {
		return this.getPadre() != null;
	}
	
	public boolean tieneMadre (){
		return this.getMadre() != null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return ((this.tienePadre() && (this.getPadre()== unMamifero || this.getPadre().tieneComoAncestroA(unMamifero) )) 
				|| (this.tieneMadre() && (this.getMadre()==unMamifero || this.getMadre().tieneComoAncestroA(unMamifero))));	
		}
	
	

	
}
			
	
	
		
		
	
		
		
	
	

	
	
	
	
	
	
	
	


