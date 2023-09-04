package myPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PlanElectrico {

	private int[][] matAdy;
	private int[] padres;
	ArrayList<Arista> aristas = new ArrayList<Arista>();
	ArrayList<Integer> electrificados = new ArrayList<Integer>();
	ArrayList<ParDeNodos> recorrido = new ArrayList<ParDeNodos>();
	ArrayList<ParDeNodos> solucion = new ArrayList<ParDeNodos>();

	private int costoTotal = 0;
	private int minimoCosto = 0;
	private int cantCiudades;
	private int cantCentrales;

	public PlanElectrico(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scan = new Scanner(file);
		int peso = 0;
		this.cantCiudades = scan.nextInt();
		this.cantCentrales = scan.nextInt();
		this.matAdy = new int[this.cantCiudades][this.cantCiudades];

		for (int i = 0; i < this.cantCentrales; i++)
			this.electrificados.add(scan.nextInt());

		for (int i = 0; i < this.cantCiudades; i++) {
			for (int j = 0; j < this.cantCiudades; j++) {
				peso = scan.nextInt();
				this.matAdy[i][j] = peso;
			}
		}
		
		for (int i = 0 ; i < this.cantCiudades - 1; i++) {
			for (int j = i + 1 ; j < this.cantCiudades; j++) {
				this.aristas.add(new Arista(i, j, this.matAdy[i][j]));
			}
		}

		Collections.sort(this.aristas, new Comparator<Arista>() {
			@Override
			public int compare(Arista a1, Arista a2) {
				return a1.getCosto() - a2.getCosto();
			}
		});

		scan.close();
	}

	public void kruskal(int habilitada) {
		int aristas = 0;
		int nodo1 = 0;
		int nodo2 = 0;
		int peso = 0;
		int k = 0;
		int noUnir = 0;

		this.padres = new int[this.cantCiudades];
		
		for (int i = 0; i < this.cantCiudades; i++)
			this.padres[i] = i;

		for (int i = 0; i < this.aristas.size(); i++) {
			nodo1 = this.aristas.get(i).getNodo1();
			nodo2 = this.aristas.get(i).getNodo2();
			peso = this.aristas.get(i).getCosto();
			
			if ((!estaElectrificada(nodo1) || (estaElectrificada(nodo1) && nodo1 == habilitada)) || (!estaElectrificada(nodo2) || (estaElectrificada(nodo2) && nodo2 == habilitada))) {
				union(this.aristas.get(i).getNodo1(), this.aristas.get(i).getNodo2());
				this.recorrido.add(new ParDeNodos(nodo1, nodo2));
				noUnir = i;
				break;
			}
		}
		
		this.costoTotal += peso;
		aristas++;

		while (aristas < (this.cantCiudades - this.cantCentrales) && k < this.aristas.size()) {
			if(k != noUnir) {
				nodo1 = this.aristas.get(k).getNodo1();
				nodo2 = this.aristas.get(k).getNodo2();
				peso = this.aristas.get(k).getCosto();
				if((!estaElectrificada(nodo1) || (estaElectrificada(nodo1) && nodo1 == habilitada)) || (!estaElectrificada(nodo2) || (estaElectrificada(nodo2) && nodo2 == habilitada))) {
					if (find(nodo1) != find(nodo2)) {
						union(nodo1, nodo2);
						aristas++;
						this.recorrido.add(new ParDeNodos(nodo1, nodo2));
						this.costoTotal += peso;
					}
				}
			}
			k++;
		}
	}
	
	public void mostrarAristas() {
		for(int i = 0 ; i < this.aristas.size() ; i++) {
			System.out.println((this.aristas.get(i).getNodo1()+1) + " " + (this.aristas.get(i).getNodo2()+1) + " " + (this.aristas.get(i).getCosto()));
		}
	}
	
	public void mostrarMatAdy() {
		for(int i = 0 ; i < this.cantCiudades ; i++) {
			for(int j = 0 ; j < this.cantCiudades ; j++)
				System.out.print(this.matAdy[i][j] + " ");
			System.out.println();
		}
	}
	
	public void mostrarPeso() {
		System.out.println(this.costoTotal);
	}

	public boolean estaElectrificada(int nodo) {
		return this.electrificados.contains(nodo);
	}

	public int find(int nodo) {
		return this.padres[nodo] == nodo ? nodo : find(this.padres[nodo]);
	}

	public void union(int nodo1, int nodo2) {
		this.padres[find(nodo1)] = this.padres[find(nodo2)];
	}

	@SuppressWarnings("unchecked")
	public void resolver() {
		if (this.electrificados.size() != this.cantCiudades) {
			for(int i = 0 ; i < this.electrificados.size() ; i++) {
				kruskal(this.electrificados.get(i));
				if(this.minimoCosto == 0 || this.costoTotal < this.minimoCosto)
				{
					this.minimoCosto = this.costoTotal;
					this.solucion = (ArrayList<ParDeNodos>) this.recorrido.clone();
				}
				this.recorrido = new ArrayList<ParDeNodos>();
			}
			
			//System.out.println(this.minimoCosto);
		}
	}
	
	public void mostrarRecorrido() {
		for(int i = 0 ; i < this.solucion.size() ; i++) 
			System.out.println((this.solucion.get(i).getNodo1()+1) + " " + (this.solucion.get(i).getNodo2()+1));
	}
	
	public void grabarRecorridoEnArchivo(String path) throws IOException {
		FileWriter file = new FileWriter(path);
		BufferedWriter buffer = new BufferedWriter(file);
		
		buffer.write(String.valueOf(this.minimoCosto));
		buffer.newLine();
		for (int i = 0; i < this.solucion.size(); i++) {
			buffer.write(String.valueOf(this.solucion.get(i).getNodo1()+1));
			buffer.write(" ");
			buffer.write(String.valueOf(this.solucion.get(i).getNodo2()+1));
			buffer.newLine();
		}
		
		buffer.close();
	}
}
