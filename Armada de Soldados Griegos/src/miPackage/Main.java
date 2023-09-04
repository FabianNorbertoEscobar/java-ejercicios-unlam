package miPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void mostrarLista(TipoSoldado tipo, List<Soldado> lista) {
		System.out.println("Tipo: " + tipo + "\n");
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).mostrar();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("ARMADA DE SOLDADOS GRIEGOS \n");

		Armada armada = new Armada();
		Set<Soldado> representantes = new HashSet<Soldado>();
		Map<TipoSoldado, List<Soldado>> mapa = new HashMap<TipoSoldado, List<Soldado>>();

		Soldado soldado1 = new Soldado(TipoSoldado.ARQUEROS, TipoRegion.ARGOS, 8, 12.3);
		Soldado soldado2 = new Soldado(TipoSoldado.CABALLEROS, TipoRegion.CORINTO, 4, 14.3);
		Soldado soldado3 = new Soldado(TipoSoldado.HONDEROS, TipoRegion.DELFOS, 12, 10.1);
		Soldado soldado4 = new Soldado(TipoSoldado.HONDEROS, TipoRegion.DELFOS, 13, 15.7);
		Soldado soldado5 = new Soldado(TipoSoldado.HONDEROS, TipoRegion.ARGOS, 5, 10.1);
		Soldado soldado6 = new Soldado(TipoSoldado.LANZADORESDEJABALINAS, TipoRegion.TEBAS, 2, 16.3);
		Soldado soldado7 = new Soldado(TipoSoldado.ARQUEROS, TipoRegion.ESPARTA, 9, 13.3);
		Soldado soldado8 = new Soldado(TipoSoldado.HOPLITAS, TipoRegion.DELFOS, 15, 10.9);
		Soldado soldado9 = new Soldado(TipoSoldado.CABALLEROS, TipoRegion.CORINTO, 1, 18.7);
		Soldado soldado10 = new Soldado(TipoSoldado.HOPLITAS, TipoRegion.ESPARTA, 11, 13.1);

		armada.agregar(soldado1);
		armada.agregar(soldado2);
		armada.agregar(soldado3);
		armada.agregar(soldado4);
		armada.agregar(soldado5);
		armada.agregar(soldado6);
		armada.agregar(soldado7);
		armada.agregar(soldado8);
		armada.agregar(soldado9);
		armada.agregar(soldado10);

		mapa = armada.agrupar();
		System.out.println("GRUPOS: \n");
		mapa.forEach((key, value) -> mostrarLista(key, value));

		representantes = armada.representantes();
		System.out.println("REPRESENTANTES: \n");
		for (Soldado soldado : representantes) {
			soldado.mostrar();
			System.out.println();
		}

	}
}
