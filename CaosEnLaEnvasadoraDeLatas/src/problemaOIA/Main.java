package problemaOIA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//generadorCaso7();

		File entrada = new File("latas.in");
		File salida = new File("latas.out");
		EnvasadoraDeLatas envasadora = new EnvasadoraDeLatas(entrada, salida);
		envasadora.resolver();
	}

	@SuppressWarnings("unused")
	private static void generadorCaso7() {
		try {
			FileWriter file = new FileWriter(
					new File("preparación de prueba/lote de prueba/entrada/07_LaHileraTiene5000Latas.in"));
			BufferedWriter buffer = new BufferedWriter(file);
			for (int i = 0; i < 4980; i++) {
				buffer.write("T");
			}
			for (int i = 0; i < 10; i++) {
				buffer.write("G");
			}
			for (int i = 0; i < 5; i++) {
				buffer.write("A");
			}
			for (int i = 0; i < 5; i++) {
				buffer.write("G");
			}
			buffer.write("F");
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al generar el archivo de entrada del caso 07 del lote de prueba");
			e.printStackTrace();
		}
	}

}
