package tenis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TenisRecargado extends EjercicioOIA {

	private int cantJuegosAGanar;
	private int diferencia;

	private String juegos;
	private int setsGanadosPorA;
	private int setsGanadosPorB;

	public TenisRecargado(File entrada, File salida) {
		super(entrada, salida);
		this.levantarEntrada();
	}

	private void levantarEntrada() {
		try {
			Scanner scan = new Scanner(this.entrada);

			scan.nextInt();
			scan.nextInt();
			this.cantJuegosAGanar = scan.nextInt();
			this.diferencia = scan.nextInt();
			this.juegos = scan.next();

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer archivo entrada...");
			e.printStackTrace();
		}
	}

	@Override
	public void resolver() {
		this.contarSets();
		this.grabarSalida();
	}

	private void contarSets() {
		int juegosA = 0;
		int juegosB = 0;

		for (int i = 0; i < this.juegos.length(); i++) {
			if (this.juegos.charAt(i) == 'A') {
				juegosA++;
			} else {
				juegosB++;
			}

			if (juegosA >= this.cantJuegosAGanar && (juegosA - juegosB) >= this.diferencia) {
				this.setsGanadosPorA++;
				juegosA = 0;
				juegosB = 0;
			}

			if (juegosB >= this.cantJuegosAGanar && (juegosB - juegosA) >= this.diferencia) {
				this.setsGanadosPorB++;
				juegosA = 0;
				juegosB = 0;
			}
		}
	}

	private void grabarSalida() {
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(this.salida));

			buffer.write(this.setsGanadosPorA + " " + this.setsGanadosPorB);

			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al grabar archivo de salida...");
			e.printStackTrace();
		}
	}

}
