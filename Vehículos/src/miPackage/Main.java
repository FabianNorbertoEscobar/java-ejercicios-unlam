package miPackage;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("CLASE VEHICULO - CLASES MOTOCICLETA Y AUTOBUS");

		List<Vehiculo> vehiculos = new LinkedList<Vehiculo>();
		
		Motocicleta moto= new Motocicleta(new Persona("Tamara",35489685),145);
		Autobus bus = new Autobus(new Persona("Andr�s",26589475),356);
		
		if (moto.cambiarChofer(new Persona("Roc�o",36695423)))
			System.out.println("Se ha cambiado el chofer de la moto exitosamente");
		
		if (moto.agregarAcompa�ante(new Persona("Sabrina",36214589)))
			System.out.println("Se ha agregado un acompa�ante a la moto");
		
		if (!moto.cambiarChofer(new Persona("Celeste",36695423)))
			System.out.println("No se ha cambiado el chofer de la moto porque hay un acompa�ante");
		
		if (bus.cambiarChofer(new Persona("Roberto",24758695)))
			System.out.println("Se ha cambiado el chofer del autob�s exitosamente");
		
		bus.agregarPasajero(new Persona("Tamara",26584785));
		bus.agregarPasajero(new Persona("Andr�s",12455859));
		System.out.println("Se han agregado dos pasajeros al autob�s");
		
		if (!bus.cambiarChofer(new Persona("Antonio",24758695)))
			System.out.println("No se ha cambiado el chofer del autob�s porque hay pasajeros");
		
		vehiculos.add(moto);
		vehiculos.add(bus);
		
		for (Vehiculo vehiculo: vehiculos) {
			System.out.println(vehiculo);
		}
	}

}
