package kmaspequenios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//generadorCasoFatiga(100000);
	
		try {
			File entrada = new File("entrada.in");
			File salida = new File("salida.out");
			KMasPequenios k = new KMasPequenios(entrada, salida);
			k.resolver();
		} catch (IOException e) {
			System.out.println("Falla la resolución del problema");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void generadorCasoFatiga(int numeros) {
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(new File("Lote de Prueba/Entrada/12_Fatiga.in")));
			buffer.write(numeros + " " + 1);
			buffer.newLine();
			buffer.write(String.valueOf(-200));
			buffer.newLine();
			int desde = -100;
			int hasta = 100;
			for (int i = 1; i < numeros; i++) {
				buffer.write(String.valueOf((int)(Math.random()*(hasta-desde+1)+desde)));
				buffer.newLine();
			}
			buffer.close();
		} catch (IOException e) {
			System.out.println("Falla generación de caso de fatiga");
			e.printStackTrace();
		}
	}

}
