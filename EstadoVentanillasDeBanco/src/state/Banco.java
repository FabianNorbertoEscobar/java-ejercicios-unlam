package state;

public class Banco {

	private String nombre;
	private String direccion;
	private Ventanilla ventanilla;

	public Banco() {
		this.ventanilla = new Ventanilla();
	}

	public void atende(Persona persona) {
		System.out.println(persona.getNombre() + " ingresa a la fila.");
		this.ventanilla.atende(persona);
	}

	public void suspendeVentanilla() {
		this.ventanilla.suspendete();
	}

	public void cerraVentanilla() {
		this.ventanilla.cerrate();
	}

	public void abriVentanilla() {
		this.ventanilla.abrite();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public Ventanilla getVentanilla() {
		return ventanilla;
	}

}
