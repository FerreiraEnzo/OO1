package ar.edu.unlp.objetos.uno.Ejercicio24;

import java.time.LocalDate;

public class Main24 {

	public static void main(String[] args) {
		
		
		Usuario juan = new Usuario("Juan Martinez", "Larrea 5800, Mar del Plata");
		
		Producto panelSolar = new Producto("Panel Solar","Reciclables",35.000,false);  
		Producto compostera = new Producto("Compostera", "Madera", 8.000, true); 
		
		
		OrdenCompra orden1= new OrdenCompra(LocalDate.now(), juan,
							"Larrea 5800, Mar del Plata", 0);
					//Precio envio? No lo pongo y lo seteo en 0 en constructor?
					//Domicilio no hace falta pasarlo devuelta, lo saco del usuario?
					// Podría enviar los productos por parámetro también y agregarlos en el constructor?
					// En las V.I que no me aclara que poner tengo que crear 
					//	un constructor nuevo sin esos parámetros o puedo suponerlos?
					//No había otra forma de hacerlo sin la lista protected?
		
		orden1.agregarProducto(panelSolar);
		orden1.agregarProducto(compostera);
		
		juan.agregarOrden(orden1);
	
		OrdenServicio orden2 = new OrdenServicio(LocalDate.now(),juan,
						"Larrea 5800, Mar del Plata","Instalacion de calefon solar",5);
				
		Tecnico lucia = new Tecnico("Lucia Iraola","Instalación solares", 4500);
		
		Producto calefonSolar = new Producto("Calefon solar", "Reciclables", 50000, false);
		
		orden2.agregarProducto(calefonSolar);
		orden2.agregarTecnico(lucia);
		
		juan.agregarOrden(orden2);

		System.out.println(orden1.calcularCosto());
		System.out.println(orden2.calcularCosto());
		
	}

}
