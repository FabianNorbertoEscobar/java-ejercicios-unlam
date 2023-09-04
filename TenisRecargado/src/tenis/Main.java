package tenis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// generarFatiga();
		// generarFatiga2();

		File entrada = new File("prehistorico.in");
		File salida = new File("prehistorico.out");
		TenisRecargado tenis = new TenisRecargado(entrada, salida);
		tenis.resolver();
	}

	public static void generarFatiga() {
		try {
			BufferedWriter buffer = new BufferedWriter(
					new FileWriter("preparación de prueba/lote de prueba/entrada/07_FatigaNJuegos.in"));
			buffer.write(106 + " " + 53 + " " + 2 + " " + 2);
			buffer.newLine();
			for (int i = 0; i < 26; i++) {
				buffer.write("AABB");
			}
			buffer.write("AA");
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al generar archivo de entrada fatiga...");
			e.printStackTrace();
		}
	}

	public static void generarFatiga2() {
		try {
			BufferedWriter buffer = new BufferedWriter(
					new FileWriter("preparación de prueba/lote de prueba/entrada/08_FatigaNJuegosV2.in"));
			buffer.write(105 + " " + 53 + " " + 1 + " " + 1);
			buffer.newLine();
			for (int i = 0; i < 52; i++) {
				buffer.write("AB");
			}
			buffer.write("A");
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al generar archivo de entrada fatiga...");
			e.printStackTrace();
		}
	}

}
