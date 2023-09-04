package miPack;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		int primero = 5;
		int segundo = 8;
		
		Calendar tiempoInicial = new GregorianCalendar();
		/*
		for (int i = 0; i < 100000000; i++) {
			int cociente = primero / segundo;
		}
		*/
		int i = 0;
		while (i < 100000000) {
			@SuppressWarnings("unused")
			int cociente = primero / segundo;
			i++;
		}
		Calendar tiempoFinal = new GregorianCalendar();

		long variacionTiempo = tiempoFinal.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo);
	}

}
