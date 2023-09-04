package myPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter("StreetNumbers.out"));
			int casita;
			for (int i = 0; i < 100000; i++) {
				casita = Casitas.casitaBalanceada2(i);
				if (casita != -1) {
					buffer.write(casita + " " + i);
					buffer.newLine();
				}
			}
			buffer.close();
			
		} catch (IOException e) {
			System.out.println("Falla generaci�n del archivo");
			e.printStackTrace();
		}
		
	}

}
