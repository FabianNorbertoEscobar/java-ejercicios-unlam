package miPaquete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Rapigrama {

	private char[][] cuadrilla;
	private List<String> palabras;

	public char[][] getCuadrilla() {
		return cuadrilla;
	}

	public void setCuadrilla(char[][] cuadrilla) {
		this.cuadrilla = cuadrilla;
	}

	public List<String> getPalabras() {
		return palabras;
	}

	public void setPalabras(List<String> palabras) {
		this.palabras = palabras;
	}

	public Rapigrama(String path) {
		File arch = new File(path);
		try {
			Scanner scan = new Scanner(arch);
			int dimMath = scan.nextInt();
			int cantPalabras = scan.nextInt();

			this.cuadrilla = new char[dimMath][dimMath];
			this.palabras = new LinkedList<String>();

			if (cantPalabras > 10000) {
				System.out.println("La cantidad de palabras del archivo es mayor a 10000");
				System.exit(0);
			}

			for (int i = 0; i < dimMath; i++) {
				String linea = scan.next();
				for (int j = 0; j < dimMath; j++) {
					this.cuadrilla[i][j] = linea.charAt(j);
				}
			}

			for (int i = 0; i < cantPalabras; i++) {
				this.palabras.add(scan.next());
			}

			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se pudo levantar la cuadrilla del archivo");
		}
	}

	private boolean recorrerEste(String palabra) {
		for (int i = 0; i < cuadrilla.length; i++) {
			StringBuilder linea = new StringBuilder();
			for (int j = 0; j < cuadrilla.length; j++) {
				linea.append(Character.toString(this.cuadrilla[i][j]));
			}
			if (linea.toString().contains(palabra)) {
				return true;
			}
		}
		return false;
	}

	private boolean recorrerOeste(String palabra) {
		for (int i = 0; i < cuadrilla.length; i++) {
			StringBuilder linea = new StringBuilder();
			for (int j = cuadrilla.length - 1; j >= 0; j--) {
				linea.append(Character.toString(this.cuadrilla[i][j]));
			}
			if (linea.toString().contains(palabra)) {
				return true;
			}
		}
		return false;
	}

	private boolean recorrerSur(String palabra) {
		for (int i = 0; i < cuadrilla.length; i++) {
			StringBuilder linea = new StringBuilder();
			for (int j = 0; j < cuadrilla.length; j++) {
				linea.append(Character.toString(this.cuadrilla[j][i]));
			}
			if (linea.toString().contains(palabra)) {
				return true;
			}
		}
		return false;
	}

	private boolean recorrerNorte(String palabra) {
		for (int i = 0; i < cuadrilla.length; i++) {
			StringBuilder linea = new StringBuilder();
			for (int j = cuadrilla.length - 1; j >= 0; j--) {
				linea.append(Character.toString(this.cuadrilla[j][i]));
			}
			if (linea.toString().contains(palabra)) {
				return true;
			}
		}
		return false;
	}

	public void buscar(String path) {
		FileWriter arch;
		try {
			arch = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(arch);
			for (int i = 0; i < palabras.size(); i++) {
				if (this.recorrerEste(palabras.get(i))) {
					buffer.write((i + 1) + " E");
					buffer.newLine();
					continue;
				}
				if (this.recorrerOeste(palabras.get(i))) {
					buffer.write((i + 1) + " O");
					buffer.newLine();
					continue;
				}
				if (this.recorrerSur(palabras.get(i))) {
					buffer.write((i + 1) + " S");
					buffer.newLine();
					continue;
				}
				if (this.recorrerNorte(palabras.get(i))) {
					buffer.write((i + 1) + " N");
					buffer.newLine();
					continue;
				}
			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
