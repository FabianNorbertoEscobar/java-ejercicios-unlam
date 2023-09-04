package miPaquete;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("RAPIGRAMA - Juego con letras");

		Rapigrama rapigrama = new Rapigrama("rapigrama.in");

		Calendar tiempoInicial = new GregorianCalendar();

		rapigrama.buscar("rapigrama.out");

		Calendar tiempoFinal = new GregorianCalendar();

		long variacionTiempo = tiempoFinal.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo);
	}

}
