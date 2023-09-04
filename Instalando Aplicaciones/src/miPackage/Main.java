package miPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Random;

@SuppressWarnings("unused")
public class Main {

	/*
	 * Se comentan las sentencias dedicadas a la generacion del archivo de
	 * entrada aleatorio, junto con las sentencias para evaluar el rendimiento
	 * del algoritmo con dicho archivo. VER: gráfico de rendimiento en la
	 * carpeta documentación.
	 */
	public static void main(String[] args) {

		// int cantidadApps = 75000;
		// int tamañoApp = 100;

		// generarEntradaAleatoria("almacenamiento.in", cantidadApps,
		// tamañoApp);

		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("almacenamiento.in");

		// GregorianCalendar t1 = new GregorianCalendar();
		appsInstaladas.seleccionarAplicaciones();
		// GregorianCalendar t2 = new GregorianCalendar();

		appsInstaladas.escribirSolucion("almacenamiento.out");

		// System.out.println("Rendimiento para n = " + cantidadApps + ": " +
		// (t2.getTimeInMillis() - t1.getTimeInMillis()));
	}

	public static void generarEntradaAleatoria(String path, int n, int tamApp) {
		try {
			FileWriter arch = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(arch);

			buffer.write(String.valueOf(n));
			buffer.write(" ");
			buffer.write(String.valueOf(tamApp));
			buffer.newLine();

			Random ran = new Random();
			for (int i = 0; i < n; i++) {
				int aleatorio = Math.abs(ran.nextInt() % tamApp + 1);
				buffer.write(String.valueOf(aleatorio));
				buffer.write(" ");
			}

			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al generar caso de fatiga...");
		}
	}
}
