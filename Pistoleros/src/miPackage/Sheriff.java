package miPackage;

public class Sheriff extends Pistolero {
	
	private static final int salud = 10;
	private static final String tipoPistolero = "Sheriff";

	public Sheriff(String nombre, Punto posicion, Arma arma) {
		super(nombre, posicion, salud, arma);
	}
	
	public Sheriff(String nombre, Arma arma) {
		super(nombre, new Punto(), salud, arma);
	}
	
	public Sheriff(String nombre, Punto posicion) {
		super(nombre, posicion, salud);
	}
	
	@Override
	public String tipoPistolero() {
		return tipoPistolero;
	}
}
