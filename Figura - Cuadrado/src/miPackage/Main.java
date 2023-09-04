package miPackage;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Figura figura1 = new Figura(); // No se puede instanciar un objeto de una clase abstracta
		//Figura figura; // Se pueden declarar objetos, pero no instanciarlos.
		
		System.out.println("CLASE FIGURA Y CLASE CUADRADO");
		
		List<Figura> figuras = new LinkedList<Figura>();
		
		figuras.add(new Cuadrado("Rojo",5));
		figuras.add(new Cuadrado("Verde",3));
		figuras.add(new Cuadrado("Amarillo",7));
		
		for (Figura figura: figuras) {
			System.out.println(figura.dameColor());
			System.out.println(figura.calcularArea());
		}
	}

}
