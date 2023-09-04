package state;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan", "Pérez", 21);
		Persona persona2 = new Persona("Sabrina", "Campas", 37);
		Persona persona3 = new Persona("Liz", "Juarez", 82);
		Persona persona4 = new Persona("Leonardo", "Ponzio", 42);

		Banco banco = new Banco();
		banco.atende(persona1);

		banco.suspendeVentanilla();

		banco.atende(persona2);
		banco.atende(persona3);

		banco.cerraVentanilla();
		banco.atende(persona4);
	}
}
