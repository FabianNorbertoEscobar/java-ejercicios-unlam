package mountainLike;

public class Carrito {

	private Punto posicion;
	private int velocidad;

	public Carrito(Punto posicion) {
		this.posicion = posicion;
	}
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	public void bajar(int desplazamiento) {
		this.velocidad += (desplazamiento - 1);
		this.posicion.trasladar(new Punto(desplazamiento, -desplazamiento));
	}
	
	public void subir(int desplazamiento) {
		if(this.velocidad - desplazamiento < 0) {
			this.posicion.trasladar(new Punto(Math.abs(this.velocidad),this.velocidad));
			this.velocidad = 0;
		} else {
			this.posicion.trasladar(new Punto(desplazamiento, desplazamiento));
			this.velocidad -= desplazamiento;
		}
	}
	
	public boolean estaQuieto() {
		return this.velocidad == 0;
	}
}
