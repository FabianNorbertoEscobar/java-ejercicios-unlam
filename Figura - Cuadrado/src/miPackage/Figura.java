package miPackage;

public abstract class Figura {

	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public String dameColor() {
		return this.color;
	}
	
	public abstract double calcularArea();
}
