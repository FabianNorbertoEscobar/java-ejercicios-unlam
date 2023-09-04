package pack;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Carrera {

	private List<Corredor> corredores;
	private List<Categoria> categorias;
	private List<Integer> resultados;

	public List<Corredor> getCorredores() {
		return corredores;
	}

	public void setCorredores(List<Corredor> corredores) {
		this.corredores = corredores;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Integer> getResultados() {
		return resultados;
	}

	public void setResultados(List<Integer> resultados) {
		this.resultados = resultados;
	}

	public Carrera(String path) {
		try {
			FileReader file = new FileReader(path);
			Scanner scan = new Scanner(file);

			int cantidadCompetidores = scan.nextInt();
			int cantidadCategoriasFemeninas = scan.nextInt();
			int cantidadCategoriasMasculinas = scan.nextInt();
			int cantidadCorredoresEnLaMeta = scan.nextInt();

			categorias = new LinkedList<Categoria>();
			for (int i = 0; i < cantidadCategoriasFemeninas; i++) {
				int edadMinima = scan.nextInt();
				int edadMaxima = scan.nextInt();
				categorias.add(new Categoria(i + 1, 'F', edadMinima, edadMaxima));
			}
			for (int i = 0; i < cantidadCategoriasMasculinas; i++) {
				int edadMinima = scan.nextInt();
				int edadMaxima = scan.nextInt();
				categorias.add(new Categoria(i + 1, 'M', edadMinima, edadMaxima));
			}
			
			corredores = new LinkedList<Corredor>();
			for(int i = 0 ; i < cantidadCompetidores ; i++) {
				int edad = scan.nextInt();
				char sexo = scan.next().charAt(0);
				Corredor corredor = new Corredor(edad, sexo, i + 1, 0);
				for (int categoria = 0; categoria < this.categorias.size(); categoria++) {
					if (this.categorias.get(categoria).correspondeACorredor(corredor)) {
						corredor.setNumeroCategoria(categoria);
						break;
					}
				}
				this.corredores.add(corredor);
			}
			
			resultados = new LinkedList<Integer>();
			for(int i = 0 ; i < cantidadCorredoresEnLaMeta ; i++) {
				resultados.add(scan.nextInt());
			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo levantar el archivo de entrada de la carrera");
		}
	}
	
	public void armarPodiosPorCategoria(String path) {
		try {
			FileWriter file = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(file);
			
			for(int i = 0 ; i < this.resultados.size() ; i++) {
				Corredor corredor = this.corredores.get(this.resultados.get(i) - 1);
				this.categorias.get(corredor.getNumeroCategoria()).agregarCorredor(corredor);
			}
			
			for(int i = 0 ; i < categorias.size() ; i++) {
				int categoria = this.categorias.get(i).getNumeroCategoria();
				int oro = this.categorias.get(i).getCorredor(0).getNumeroCorredor();
				int plata = this.categorias.get(i).getCorredor(1).getNumeroCorredor();
				int bronce = this.categorias.get(i).getCorredor(2).getNumeroCorredor();
				
				buffer.write(categoria + " " + oro + " " + plata + " " +  bronce);
				buffer.newLine();
			}
			buffer.close();
		} catch (IOException e) {
			System.out.println("No se pudo generar el archivo de salida de la carrera");
		}
	}
	
}
