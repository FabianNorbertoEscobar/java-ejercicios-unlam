package mountainLike;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MontañaComo extends EjercicioOIA {

	private ArrayList<Integer> puntas;
	private Carrito carrito;

	public MontañaComo(File entrada, File salida) {
		super(entrada, salida);
		this.puntas = new ArrayList<Integer>();
		this.levantarEntrada();
	}

	private void levantarEntrada() {
		try {
			Scanner scan = new Scanner(new FileReader(this.entrada));
			int cantidadPuntas = scan.nextInt();
			for (int i = 0; i < cantidadPuntas; i++) {
				this.puntas.add(scan.nextInt());
			}
			this.ubicarCarrito(scan.nextInt());
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al levantar el archivo de entrada");
			e.printStackTrace();
		}
	}

	private void ubicarCarrito(int x) {
		int yAnterior = this.puntas.get(0);
		int yActual;
		int xCalculado = 0;
		int yCalculado;
		for (int i = 1; i < this.puntas.size(); i++) {
			yActual = this.puntas.get(i);
			xCalculado += Math.abs(yAnterior - yActual);
			if (xCalculado >= x) {
				if (this.hayCimaEnPunta(i)) {
					yCalculado = Math.abs(xCalculado - x - yActual);
				} else {
					yCalculado = Math.abs(xCalculado - x + yActual);
				}
				this.carrito = new Carrito(new Punto(x, yCalculado));
				break;
			}
			yAnterior = yActual;
		}
	}
	
	private boolean hayCimaEnPunta(int i) {
		return i % 2 == 0;
	}

	@Override
	public void resolver() {
		this.rodarCarrito();
		this.grabarSalida();
	}

	private void rodarCarrito() {
		int yAnterior = this.carrito.getPosicion().getY();
		int yActual;
		int desplazamiento;
		for (int i = 1; i < this.puntas.size(); i++) {
			yActual = this.puntas.get(i);
			desplazamiento = Math.abs(yAnterior - yActual);
			if (this.hayCimaEnPunta(i - 1)) {
				this.carrito.bajar(desplazamiento);
			} else {
				this.carrito.subir(desplazamiento);
				if (this.carrito.estaQuieto() && (yActual != this.carrito.getPosicion().getY())) {
					break;
				}
			}
			yAnterior = yActual;
		}
	}

	private void grabarSalida() {
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(this.salida));
			buffer.write(this.carrito.getPosicion().getX() + " " + this.carrito.getPosicion().getY());
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al grabar el archivo de salida");
			e.printStackTrace();
		}
	}

}
