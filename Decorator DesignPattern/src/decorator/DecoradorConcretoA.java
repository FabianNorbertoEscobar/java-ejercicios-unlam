package decorator;

public class DecoradorConcretoA extends Decorador {

	private String propiedadAgregada;
	
	public DecoradorConcretoA(Componente componente) {
		super(componente);
		this.propiedadAgregada = "Propiedad A";
	}
	
	public void operacion() {
		super.operacion();
		System.out.println("DecoradorConcretoA.operacion();");
	}

	public String getPropiedadAgregada() {
		return propiedadAgregada;
	}

}
