package miPackage;

public class Renegado extends Pistolero {

	private static final int salud = 9;
	private static final String tipoPistolero = "Renegado";

	public Renegado(String nombre, Punto posicion, Arma arma) {
		super(nombre, posicion, salud, arma);
	}
	
	public Renegado(String nombre, Arma arma) {
		super(nombre, new Punto(), salud, arma);
	}
	
	public Renegado(String nombre, Punto posicion) {
		super(nombre, posicion, salud);
	}
	
	@Override
	public String tipoPistolero() {
		return tipoPistolero;
	}
}
