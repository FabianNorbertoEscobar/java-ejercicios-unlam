package miPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AplicacionesInstaladas {

	private int cantidadDeAplicaciones;
	private int tama�oNuevaAplicacion;
	private List<Integer> tama�osAplicaciones;
	private List<AplicacionesADesinstalar> aplicaciones;

	public int getCantidadDeAplicaciones() {
		return cantidadDeAplicaciones;
	}

	public void setCantidadDeAplicaciones(int cantidadDeAplicaciones) {
		this.cantidadDeAplicaciones = cantidadDeAplicaciones;
	}

	public int getTama�oNuevaAplicacion() {
		return tama�oNuevaAplicacion;
	}

	public void setTama�oNuevaAplicacion(int tama�oNuevaAplicacion) {
		this.tama�oNuevaAplicacion = tama�oNuevaAplicacion;
	}

	public AplicacionesInstaladas(String path) {
		try {
			File arch = new File(path);
			Scanner scan = new Scanner(arch);

			this.cantidadDeAplicaciones = scan.nextInt();
			if (this.cantidadDeAplicaciones > 50000 || this.cantidadDeAplicaciones < 1) {
				System.out.println("La cantidad de aplicaciones ingresada no es v�lida");
				System.exit(1);
			}

			this.tama�oNuevaAplicacion = scan.nextInt();
			if (this.tama�oNuevaAplicacion > 1000 || this.tama�oNuevaAplicacion < 1) {
				System.out.println("El tama�o de la aplicacion ingresada no es v�lida");
				System.exit(1);
			}

			this.tama�osAplicaciones = new LinkedList<Integer>();
			this.aplicaciones = new LinkedList<AplicacionesADesinstalar>();

			for (int i = 0; i < this.cantidadDeAplicaciones; i++) {
				this.tama�osAplicaciones.add(scan.nextInt());
			}

			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir el archivo...");
		}
	}

	@SuppressWarnings("unchecked")
	public void seleccionarAplicaciones() {

		int cantAppSumadas;
		int valorSumaApps;

		for (int i = 0; i < this.cantidadDeAplicaciones; i++) {
			cantAppSumadas = 0;
			valorSumaApps = 0;
			int j = i;
			while (valorSumaApps < this.tama�oNuevaAplicacion && j < this.cantidadDeAplicaciones) {
				cantAppSumadas++;
				valorSumaApps += this.tama�osAplicaciones.get(j);
				j++;
			}
			if (valorSumaApps < this.tama�oNuevaAplicacion) {
				break;
			}
			AplicacionesADesinstalar appsADesinstalar = new AplicacionesADesinstalar(cantAppSumadas, valorSumaApps,
					i + 1);
			this.aplicaciones.add(appsADesinstalar);
		}
		if (!this.aplicaciones.isEmpty())
			Collections.sort(this.aplicaciones);
	}

	public void escribirSolucion(String path) {
		try {
			FileWriter arch = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(arch);

			if (this.aplicaciones.isEmpty())
				buffer.write("MEMORIA INSUFICIENTE");
			else {
				buffer.write(String.valueOf(this.aplicaciones.get(0).getCantidadApps()));
				buffer.newLine();
				buffer.write(String.valueOf(this.aplicaciones.get(0).getPosPrimerApp()));
			}

			buffer.close();
		} catch (IOException e) {
			System.out.println("Problema al generar el archivo...");
		}
	}
}
