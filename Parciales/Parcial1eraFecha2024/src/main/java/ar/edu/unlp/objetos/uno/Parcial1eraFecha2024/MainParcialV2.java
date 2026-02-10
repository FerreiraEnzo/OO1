package ar.edu.unlp.objetos.uno.Parcial1eraFecha2024;

import java.time.LocalDate;

public class MainParcialV2 {

	public static void main(String[] args) {

		Usuario usu = new Usuario("Matías");
		
		Sede sedeUno = new Sede("Quinta Los Hermanos", 500, 4);
		Sede sedeDos = new Sede("Camping LP", 100, 5);
		
		EventoPresencial eventoCumple = new EventoPresencial("Cumpleaños",LocalDate.now(), 
																"Terror",500,100);
		
		eventoCumple.agregarSede(sedeUno);
		eventoCumple.agregarSede(sedeDos);
		
		usu.comprarEntrada(eventoCumple, true);
		
		
	}

}
