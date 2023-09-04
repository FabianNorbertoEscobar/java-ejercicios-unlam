package principalPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class NombresRepetidos extends EjercicioOIA {

	private Map<String, Integer> nombres;
	private Map<Integer, String> repetidos;
	private int buscados;

	public NombresRepetidos(File entrada, File salida) throws FileNotFoundException {
		super(entrada, salida);
		this.nombres = new TreeMap<String, Integer>();
		this.repetidos = new TreeMap<Integer, String>();
	}

	@Override
	public void resolver() throws IOException {
		this.leerEntrada();
		this.seleccionarMasRepetidos();
		this.grabarSalida();
	}

	private void leerEntrada() throws IOException {
		Scanner scan = new Scanner(new FileReader(this.entrada));
		
		int chicos = scan.nextInt();
		this.buscados = scan.nextInt();
		
		String nombre;
		Integer apariciones;
		
		for (int i = 0; i < chicos; i++) {
			nombre = scan.next();
			//si el map tiene la clave
			if (this.nombres.containsKey(nombre)) {
				//obtengo el valor de esa clave
				apariciones = this.nombres.get(nombre);
				//actualizo registro
				this.nombres.put(nombre, apariciones + 1);
			} else {
				// agrego registro
				this.nombres.put(nombre, 1);
			}
		}
		scan.close();
	}
	
	private void seleccionarMasRepetidos() {
		for (Entry<String, Integer> nombre: this.nombres.entrySet()) {
			this.repetidos.put(nombre.getValue(), nombre.getKey());
		}
		
	}

	private void grabarSalida() throws IOException {
		BufferedWriter buffer = new BufferedWriter(new FileWriter(this.salida));
		
		// si no me alcanzan los nombres diferentes para encontrar los buscados
		if (this.buscados > this.repetidos.size()) {
			// los buscados son todos los que tengo
			this.buscados = this.repetidos.size();
		}
		
		for (int i = 0; i < this.buscados; i++) {
			Entry<Integer, String> nombre = ((TreeMap<Integer,String>) this.repetidos).pollLastEntry();
			buffer.write(nombre.getValue() + " " + nombre.getKey());
			buffer.newLine();
		}
		buffer.close();
	}

}
