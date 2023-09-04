package pack;

import java.util.LinkedList;
import java.util.List;

public class Categoria {

	private int numeroCategoria;
	private char sexo;
	private int edadMinima;
	private int edadMaxima;
	private List<Corredor> corredores;

	public int getNumeroCategoria() {
		return numeroCategoria;
	}

	public void setNumeroCategoria(int numeroCategoria) {
		this.numeroCategoria = numeroCategoria;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public int getEdadMaxima() {
		return edadMaxima;
	}

	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}

	public Categoria(int numeroCategoria, char sexo, int edadMinima, int edadMaxima) {
		this.numeroCategoria = numeroCategoria;
		this.sexo = sexo;
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
		this.corredores = new LinkedList<Corredor>();
	}

	public void agregarCorredor(Corredor corredor) {
		this.corredores.add(corredor);
	}

	public boolean correspondeACorredor(Corredor corredor) {
		return corredor.getEdad() >= this.getEdadMinima() && corredor.getEdad() <= this.getEdadMaxima();
	}

	public Corredor getCorredor(int corredor) {
		if (corredor < corredores.size()) {
			return this.corredores.get(corredor);
		} else {
			return new Corredor(0, 'X', 0, 0);
		}
	}
}
