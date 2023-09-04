import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritura {
	
	public static void escribirArchivo(String path, String texto) throws FileNotFoundException, IOException {
		
		FileWriter file = new FileWriter(path);
		BufferedWriter buffer = new BufferedWriter(file);
		
		buffer.write(texto);
		buffer.close();
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el texto a grabar en el archivo de texto:");
		
		String lectura = scan.nextLine();
		scan.close();
		
		try {
			escribirArchivo("archivo.txt" , lectura);
		}
		catch (IOException e) {
			
			System.out.println("Problema al abrir el archivo");
			System.exit(0);
		}
	}
}
