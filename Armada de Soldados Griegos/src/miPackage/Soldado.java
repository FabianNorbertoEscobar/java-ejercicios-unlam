package miPackage;

public class Soldado {

	private TipoSoldado tipo;
	private TipoRegion region;
	private int rango;
	private double velocidad;

	public TipoSoldado getTipo() {
		return tipo;
	}

	public void setTipo(TipoSoldado tipo) {
		this.tipo = tipo;
	}

	public TipoRegion getRegion() {
		return region;
	}

	public void setRegion(TipoRegion region) {
		this.region = region;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public Soldado(TipoSoldado tipo, TipoRegion region, int rango, double velocidad) {
		this.tipo = tipo;
		this.region = region;
		this.rango = rango;
		this.velocidad = velocidad;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.region.ordinal();
		return result;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void mostrar() {
		System.out.println("Tipo: " + this.tipo + "\nRegión: " + this.region + "\nRango: " + this.rango
				+ "\nVelocidad: " + this.velocidad);
	}
}
