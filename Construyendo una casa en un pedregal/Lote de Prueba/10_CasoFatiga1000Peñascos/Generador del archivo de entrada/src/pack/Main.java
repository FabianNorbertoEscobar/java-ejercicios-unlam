package pack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter file;
		try {
			file = new FileWriter("../entrada/pedregal.in");
			BufferedWriter buffer = new BufferedWriter(file);
			
			buffer.write(25 + " " + 41);
			buffer.newLine();
			buffer.write(4 + " " + 2);
			buffer.newLine();
			buffer.write("1000");
			
			boolean[][] mat = new boolean[41][25];
			for (int i = 16 ,j = 24; i < 41; i++ ,j--) {
				mat[i][j] = true;
			}
			
			int cont = 0;
			for (int i = 0; i < 41; i++) {
				for (int j = 0; j < 25; j++) {
					if (mat[i][j] == false) {
						buffer.newLine();
						buffer.write((i+1) + " " + (j+1));
						cont ++;
					}
				}
			}
			
			buffer.close();
			
			System.out.println("Cantidad de peñascos en el terreno: " + cont);
		} catch (IOException e) {
			System.out.println("No se pudo generar el archivo de entrada");
		}		
	}
}
