import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void abrirArchivo(String path) throws FileNotFoundException, IOException {
		
		String lectura;
		
		FileReader file = new FileReader(path);
		BufferedReader buffer = new BufferedReader(file);
		
		while((lectura = buffer.readLine()) != null) {
			
			System.out.println(lectura);
		}
		
		buffer.close();
	}

	public static void main(String[] args) {
		
		try {
			abrirArchivo("Prueba.txt");
		}
		catch (IOException e) {

			System.out.println("Problema al abrir el archivo");
			System.exit(0);
		}
	}
}
