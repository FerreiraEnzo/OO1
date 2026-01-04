package ar.edu.unlp.objetos.uno.Ejercicio9;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private boolean estado;
	private List<Farola> farolas;
	
	
	public Farola() {
		this.estado = false;
		this.farolas = new LinkedList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.agregarFarola(otraFarola);
		otraFarola.agregarFarola(this);
	}
	
	public void agregarFarola(Farola unaFarola) {
		this.farolas.add(unaFarola);
	}
	
	public List<Farola> getNeighbors(){
		
		return farolas;
	}
	
	public void turnOn() {
		
		if(!this.isOn()) {
			this.estado = true;

			for(Farola f : farolas)
				f.turnOn();
		}
	}
	
	public void turnONV2() {
		
		if(!this.isOn()){
			this.estado = true;
			
			farolas.forEach(f -> f.turnONV2());
			
		}
		
		
	}
	
	public void turnOff() {
		
		if(this.isOn()) {
			this.estado = false;
		
			for(Farola f : farolas)
				f.turnOff();
		}
	}
	
	public void turnOffV2() {
		
		if(this.isOff()) {
			this.estado = false;
			
			farolas.forEach(f-> f.turnOffV2());
		}
	}
	
	
	public boolean isOn() {
		
		return estado;
	}
	
	public boolean isOff() {
		
		return !estado;
		
	}
	

}
