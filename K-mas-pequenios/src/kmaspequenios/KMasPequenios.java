package kmaspequenios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class KMasPequenios extends EjercicioOIA {

	TreeSet<Integer> numeros = new TreeSet<Integer>();
	private int cantidad;
	private int k;

	public KMasPequenios(File entrada, File salida) {
		super(entrada, salida);
	}

	@Override
	public void resolver() throws IOException {
		Scanner scan = new Scanner(new FileReader(this.entrada));
		this.cantidad = scan.nextInt();
		this.k = scan.nextInt();

		for (int i = 0; i < cantidad; i++) {
			this.numeros.add(scan.nextInt());
		}
		scan.close();

		BufferedWriter buffer = new BufferedWriter(new FileWriter(this.salida));
		if (this.k > this.numeros.size()) {
			this.k = this.numeros.size();
		}
		buffer.write(String.valueOf(this.k));
		buffer.newLine();
		for (int i = 0; i < this.k; i++) {
			buffer.write(String.valueOf(this.numeros.first()));
			buffer.newLine();
			this.numeros.remove(this.numeros.first());
		}
		buffer.close();
	}

}
