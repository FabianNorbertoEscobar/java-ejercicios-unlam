package decorator;

public class Cliente {

	public static void main(String[] args) {
		ComponenteConcreto componente = new ComponenteConcreto();
		DecoradorConcretoA decorador1 = new DecoradorConcretoA(componente);
		DecoradorConcretoB decorador2 = new DecoradorConcretoB(decorador1);
		componente.operacion();
		decorador1.operacion();
		System.out.println(decorador1.getPropiedadAgregada());
		decorador2.operacion();
		System.out.println(decorador2.getPropiedadAgregada());
	}

}
