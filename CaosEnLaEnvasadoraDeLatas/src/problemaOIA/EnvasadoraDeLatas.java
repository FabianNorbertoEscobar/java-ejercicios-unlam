package problemaOIA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EnvasadoraDeLatas extends EjercicioOIA {

	private ArrayList<Character> latas;
	private Secuencia secuenciaMaslarga;
	private Secuencia segundaSecuenciaMasLarga;

	public EnvasadoraDeLatas(File entrada, File salida) {
		super(entrada, salida);
		this.latas = new ArrayList<Character>();
		this.levantarEntrada();
		this.secuenciaMaslarga = new Secuencia(0, 0, 0);
		this.segundaSecuenciaMasLarga = new Secuencia(0, 0, 0);
	}

	private void levantarEntrada() {
		try {
			Scanner scan = new Scanner(new FileReader(this.entrada));
			// leo toda la secuencia de latas
			String lata = scan.next();
			for (int i = 0; i < lata.length() - 1; i++) {
				// agrego cada lata a la lista de latas
				this.latas.add(lata.charAt(i));
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al levantar el archivo de entrada");
			e.printStackTrace();
		}
	}

	@Override
	public void resolver() {
		this.buscarSecuencias();
		this.grabarSalida();
	}

	private void buscarSecuencias() {
		int posicionInicio, posicionFin, longitud = 0;
		// para cada lata
		for (int i = 0; i < this.latas.size(); i++) {

			// si la lata es de garbanzos
			if (this.latas.get(i).equals('G')) {
				// comienza una secuencia de latas de garbanzos
				posicionInicio = i;
				// cuento todas las latas de garbanzos mientras haya latas
				do {
					longitud++;
					i++;
				} while (i < this.latas.size() && this.latas.get(i).equals('G'));
				// la secuencia termina en la lata anterior
				posicionFin = i - 1;

				// acomodo la secuencia en el ranking
				if (longitud > this.secuenciaMaslarga.getLongitud()) {
					this.segundaSecuenciaMasLarga = this.secuenciaMaslarga;
					this.secuenciaMaslarga = new Secuencia(longitud, posicionInicio, posicionFin);
				} else if (longitud > this.segundaSecuenciaMasLarga.getLongitud()) {
					this.segundaSecuenciaMasLarga = new Secuencia(longitud, posicionInicio, posicionFin);
				}

				// contador de longitud a cero
				longitud = 0;
			}
		}
	}

	private void grabarSalida() {
		try {
			PrintWriter print = new PrintWriter(new FileWriter(this.salida));
			print.println(this.latas.size());
			print.println(this.secuenciaMaslarga.getLongitud());
			print.println(this.segundaSecuenciaMasLarga.getLongitud());
			print.print(this.calcularDistanciaEntreSecuencias());
			print.close();
		} catch (IOException e) {
			System.out.println("Error al grabar el archivo de salida");
			e.printStackTrace();
		}
	}

	private int calcularDistanciaEntreSecuencias() {
		// si tengo solo una secuencia, la distancuia entre ellas es cero
		if (this.secuenciaMaslarga.getLongitud() == 0 || this.segundaSecuenciaMasLarga.getLongitud() == 0) {
			return 0;
		} else {
			// la distancia es el inicio de la segunda menos el fin de la
			// primera menos 1
			if (this.secuenciaMaslarga.getPosicionInicio() < this.segundaSecuenciaMasLarga.getPosicionInicio()) {
				return this.segundaSecuenciaMasLarga.getPosicionInicio() - this.secuenciaMaslarga.getPosicionFin() - 1;
			} else {
				return this.secuenciaMaslarga.getPosicionInicio() - this.segundaSecuenciaMasLarga.getPosicionFin() - 1;
			}
		}
	}

}
