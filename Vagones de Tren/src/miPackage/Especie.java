package miPackage;

public class Especie implements Comparable<Especie> {
	
	private String nombre;
	private int agresividad;
	private int animales;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAgresividad() {
		return agresividad;
	}

	public void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}

	public int getAnimales() {
		return animales;
	}

	public void setAnimales(int animales) {
		this.animales = animales;
	}

	public Especie(String nombre, int agresividad, int animales) {
		this.nombre = nombre;
		this.agresividad = agresividad;
		this.animales = animales;
	}
	
	@Override
	public int compareTo(Especie especie) {
		return this.agresividad - especie.agresividad;
	}
	
}
