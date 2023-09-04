package miPack;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Complejo c1 = new Complejo();
		Complejo c2 = new Complejo(2,3);
		Complejo c3 = new Complejo(4,2);
		
		System.out.println("Complejo c1: " + c1.toString());
		System.out.println("Complejo c2: " + c2.toString());
		System.out.println("Complejo c3: " + c3.toString());
		
		System.out.println("Módulo c1: " + c1.modulo());
		System.out.println("Módulo c2: " + c2.modulo());
		System.out.println("Módulo c3: " + c3.modulo());
		
		System.out.println("Suma: " + c2.sumar(c3).toString());
		System.out.println("Resta: " + c2.restar(c3).toString());
		System.out.println("Multiplicación: " + c2.multiplicar(c3).toString());
		System.out.println("División: " + c2.dividir(c3).toString());
		
		System.out.println("Suma: " + c2.sumar(2).toString());
		System.out.println("Resta: " + c2.restar(2).toString());
		System.out.println("Multiplicación: " + c2.multiplicar(2).toString());
		System.out.println("División: " + c2.dividir(2).toString());
		
		c1 = c2.clone();
		System.out.println("C1 clon de c2: " + c1);
		
		if (c1.equals(c2))
			System.out.println("Clonados exitosamente");
		
		ArrayList<Complejo> complejos = new ArrayList<Complejo>();
		
		complejos.add(c1);
		complejos.add(c2);
		complejos.add(c3);
		
		System.out.println("Complejos Desordenados");
		for (Complejo comp : complejos) {
			System.out.println(comp.toString());
		}
		
		Collections.sort(complejos);
		
		System.out.println("Complejos Ordenados Ascendentemente");
		for (Complejo comp : complejos) {
			System.out.println(comp.toString());
		}		
		
		Collections.reverse(complejos);
		
		System.out.println("Complejos Ordenados Descendentemente");
		for (Complejo comp : complejos) {
			System.out.println(comp.toString());
		}	
	}
}
