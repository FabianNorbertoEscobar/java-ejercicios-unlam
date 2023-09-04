package altaEnElCielo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AltaEnElCielo extends EjercicioOIA {

	private int carretel;
	private int cantidadBanderas;
	private ArrayList<Bandera> banderas;

	private int banderaMasLarga;
	private int maximaLongitud;
	private int maximaCantidadCosturas;

	private int largoSubsecuenciaMaxima;
	private int banderaA;
	private int banderaB;

	public AltaEnElCielo(File entrada, File salida) throws FileNotFoundException {
		super(entrada, salida);
		this.leerEntrada();
	}

	private void leerEntrada() throws FileNotFoundException {
		Scanner scan = new Scanner(new FileReader(this.entrada));
		this.carretel = scan.nextInt();
		this.cantidadBanderas = scan.nextInt();
		this.banderas = new ArrayList<Bandera>();
		int retazo;
		for (int i = 0; i < this.cantidadBanderas; i++) {
			retazo = scan.nextInt();
			this.banderas.add(new Bandera(retazo));
			this.carretel -= retazo;
		}
		scan.close();

	}

	@Override
	public void resolver() throws IOException {
		this.coserBanderas();
		this.calcularBanderaMasLarga();
		this.calcularMaximaCantidadCosturas();
		this.buscarSubsecuenciaMaxima();
		this.escribirSolucion();
	}

	private void coserBanderas() {
		int retazo;
		boolean costura = false;
		for (Bandera bandera : this.banderas) {
			if ((retazo = nextSecuenciaDeBlautzik(bandera.getUltimoRetazo())) <= this.carretel) {
				this.carretel -= retazo;
				bandera.coser(retazo);
				costura = true;
			}
		}
		if (costura) {
			this.coserBanderas();
		}
	}

	private static int nextSecuenciaDeBlautzik(int retazoAnterior) {
		String num = String.valueOf(retazoAnterior);
		int suma = retazoAnterior;
		int cifra;
		for (int j = 0; j < num.length(); j++) {
			cifra = Character.digit(num.charAt(j), 10);
			suma += cifra;
		}
		return suma;
	}

	private void calcularBanderaMasLarga() {
		this.banderaMasLarga = 0;
		this.maximaLongitud = this.banderas.get(0).getLargo();
		for (int i = 1; i < this.banderas.size(); i++) {
			if (this.banderas.get(i).getLargo() > this.maximaLongitud) {
				this.banderaMasLarga = i + 1;
				this.maximaLongitud = this.banderas.get(i).getLargo();
			}
		}
	}

	private void calcularMaximaCantidadCosturas() {
		this.maximaCantidadCosturas = this.banderas.get(0).costuras();
		for (int i = 1; i < this.banderas.size(); i++) {
			if (this.banderas.get(i).costuras() > this.maximaCantidadCosturas) {
				this.maximaCantidadCosturas = this.banderas.get(i).costuras();
			}
		}
	}

	private void buscarSubsecuenciaMaxima() {
		int longitudSubsecuencia = 0;
		for (int i = 0; i < this.banderas.size() - 1; i++) {
			for (int j = i + 1; j < this.banderas.size(); j++) {
				for (Integer retazo1 : this.banderas.get(i).retazos()) {
					for (Integer retazo2 : this.banderas.get(j).retazos()) {
						if (retazo1.equals(retazo2)) {
							longitudSubsecuencia++;
						}
					}
				}
				if (longitudSubsecuencia > this.largoSubsecuenciaMaxima) {
					this.largoSubsecuenciaMaxima = longitudSubsecuencia;
					this.banderaA = i + 1;
					this.banderaB = j;
				}
			}
		}
	}

	private void escribirSolucion() throws IOException {
		BufferedWriter buffer = new BufferedWriter(new FileWriter(this.salida));
		buffer.write(this.banderaMasLarga + " " + this.maximaLongitud);
		buffer.newLine();
		buffer.write(String.valueOf(this.maximaCantidadCosturas));
		buffer.newLine();
		buffer.write(String.valueOf(String.valueOf(this.carretel)));
		buffer.newLine();
		if (this.largoSubsecuenciaMaxima < 1) {
			buffer.write(String.valueOf(0));
		} else {
			buffer.write(this.largoSubsecuenciaMaxima - 1 + " " + this.banderaA + " " + this.banderaB);
		}
		buffer.close();
	}
}
