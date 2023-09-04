package cola;

import monticulo.Monticulo;
import monticulo.MonticuloMinimo;

public class ColaDePrioridad {

	private Monticulo monticulo;
	private int tamañoMaximo;
	private int cantidadDeElementos;

	public int getTamañoMaximo() {
		return tamañoMaximo;
	}

	public int getCantidadDeElementos() {
		return cantidadDeElementos;
	}

	public ColaDePrioridad(int tamañoMaximo) {
		this.tamañoMaximo = tamañoMaximo;
		this.monticulo = new MonticuloMinimo(tamañoMaximo);
		this.cantidadDeElementos = 0;
	}

	public boolean estaVacia() {
		return this.monticulo.estaVacio();
	}

	public boolean estaLlena() {
		return this.monticulo.estaLleno();
	}

	public void insertar(int nuevo) throws IllegalStateException {
		if (this.estaLlena()) {
			throw new IllegalStateException("No se puede insertar. Cola de prioridad llena.");
		}
		this.cantidadDeElementos++;
		this.monticulo.insertar(nuevo);
	}

	public int eliminar() throws IllegalStateException {
		if (this.estaVacia()) {
			throw new IllegalStateException("No se puede eliminar. Cola de prioridad vacía.");
		}
		this.cantidadDeElementos--;
		return this.monticulo.eliminar();
	}

	public int pispear() throws IllegalStateException {
		if (this.estaVacia()) {
			throw new IllegalStateException("No se puede pispear. Cola de prioridad vacía.");
		}
		return this.monticulo.pispear();
	}
}
