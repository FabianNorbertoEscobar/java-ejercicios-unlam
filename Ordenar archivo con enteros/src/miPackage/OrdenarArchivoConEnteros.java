package miPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OrdenarArchivoConEnteros {
	
	static int elementos;
	static int vector[];
	
	public static void cargarArchivoEnArray(String path) throws FileNotFoundException, IOException {
		
		FileReader file = new FileReader(path);
		Scanner scan = new Scanner(file);
		
		elementos = scan.nextInt();
		vector = new int[elementos];
		
		for (int i = 0; i < elementos; i++) {
			
			vector[i] = scan.nextInt();
		}
		scan.close();
	}
	
	public static void ordenarArray() {
		
	    int posMenor, aux;
	    
		for (int j = 1; j < elementos; j++) {
			
			posMenor = j - 1;
			
			for (int i = j; i < elementos; i++) {
				
				if (vector[i] < vector[posMenor]) {
					posMenor = i;
				}
			}
			
			aux = vector[posMenor];
			vector[posMenor] = vector[j - 1];
			vector[j - 1] = aux;
		}
	}
	
	public static void mostrarArray() {
		
		for (int i = 0; i < elementos; i++) {
			
			System.out.println(vector[i]);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escriba el path del archivo de entrada:");
		
		String path = scan.nextLine();
		scan.close();
		
		try {
			cargarArchivoEnArray(path);
		}
		catch (IOException e) {

			System.out.println("Error al abrir el archivo");
			System.exit(0);
		}
		ordenarArray();
		
		System.out.println("Enteros Ordenados");
		mostrarArray();
	}

}
