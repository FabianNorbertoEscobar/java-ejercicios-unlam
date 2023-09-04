package miPackage;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class Tren {

	private int cantidadEspecies;
	private int agresividadMaxima;
	private int vagonesNecesarios;
	private int agresividadTotal;
	private LinkedList<Especie> especies;
	private Hashtable<Especie, Integer> vagones;

	public int getCantidadEspecies() {
		return cantidadEspecies;
	}

	public void setCantidadEspecies(int cantidadEspecies) {
		this.cantidadEspecies = cantidadEspecies;
	}

	public int getAgresividadMaxima() {
		return agresividadMaxima;
	}

	public void setAgresividadMaxima(int agresividadMaxima) {
		this.agresividadMaxima = agresividadMaxima;
	}

	public int getVagonesNecesarios() {
		return vagonesNecesarios;
	}

	public void setVagonesNecesarios(int vagonesNecesarios) {
		this.vagonesNecesarios = vagonesNecesarios;
	}

	public int getAgresividadTotal() {
		return agresividadTotal;
	}

	public void setAgresividadTotal(int agresividadTotal) {
		this.agresividadTotal = agresividadTotal;
	}

	public Tren(String path) {
		try {
			FileReader file = new FileReader(path);
			Scanner scan = new Scanner(file);

			this.setCantidadEspecies(scan.nextInt());
			this.setAgresividadMaxima(scan.nextInt());
			this.setVagonesNecesarios(0);
			this.setAgresividadTotal(0);

			this.especies = new LinkedList<Especie>();

			for (int i = 0; i < this.getCantidadEspecies(); i++) {
				String nombre = scan.next();
				int agresividad = scan.nextInt();
				int animales = scan.nextInt();

				Especie especie = new Especie(nombre, agresividad, animales);
				this.especies.add(especie);
			}

			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se pudo levantar el archivo de entrada");
		}
	}

	public void separarAnimalesEnVagones(String path) {
		try {
			FileWriter file = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(file);
			
			Collections.sort(this.especies);
			this.vagones = new Hashtable<Especie, Integer>();

			int i = 0, j = 0;
			while (i < this.especies.size() - 1 && j < this.especies.size()) {
				j = i + 1;
				while (j < this.especies.size() && this.especies.get(j).getAgresividad()
						- this.especies.get(i).getAgresividad() < this.agresividadMaxima) {
					j++;
				}

				this.setVagonesNecesarios(this.getVagonesNecesarios() + 1);
				for (int k = i; k < j; k++) {
					this.vagones.put(especies.get(k), this.getVagonesNecesarios());
				}

				int agresividadVagon = this.especies.get(j - 1).getAgresividad() - this.especies.get(i).getAgresividad();
				this.setAgresividadTotal(this.getAgresividadTotal() + agresividadVagon);
				i = j;
			}

			buffer.write(this.getVagonesNecesarios() + " " + this.getAgresividadTotal());
			buffer.close();

		} catch (IOException e) {
			System.out.println("No se pudo generar generar el archivo de salida");
		}
	}
}
