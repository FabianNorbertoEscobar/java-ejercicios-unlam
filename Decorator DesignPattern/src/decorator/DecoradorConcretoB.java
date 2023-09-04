package decorator;

public class DecoradorConcretoB extends Decorador {

	private String propiedadAgregada;
	
	public DecoradorConcretoB(Componente componente) {
		super(componente);
		this.propiedadAgregada = "Propiedad B";
	}
	
	public void operacion() {
		super.operacion();
		System.out.println("DecoradorConcretoB.operacion();");
	}
	
	public String getPropiedadAgregada() {
		return propiedadAgregada;
	}
}
