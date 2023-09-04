package altaEnElCielo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			File entrada = new File("bandera.in");
			File salida = new File("bandera.out");
			AltaEnElCielo altaEnElCielo = new AltaEnElCielo(entrada, salida);
			altaEnElCielo.resolver();
		} catch (FileNotFoundException e) {
			System.out.println("Falla al levantar el archivo de entrada.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Falla al grabar el archivo de salida.");
			e.printStackTrace();
		}

	}

}
