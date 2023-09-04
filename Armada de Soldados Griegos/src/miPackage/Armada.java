package miPackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Armada {

	private List<Soldado> soldados;

	public List<Soldado> getSoldados() {
		return soldados;
	}

	public void setSoldados(List<Soldado> soldados) {
		this.soldados = soldados;
	}

	public Armada() {
		soldados = new LinkedList<Soldado>();
	}

	public void agregar(Soldado soldado) {
		this.soldados.add(soldado);
	}

	public List<Soldado> formacionPorRango() {
		List<Soldado> ordenados = new LinkedList<Soldado>(this.soldados);
		Collections.sort(ordenados, new RangoComparator());
		Collections.reverse(ordenados);
		return ordenados;
	}

	public List<Soldado> formacionPorVelocidad() {
		List<Soldado> ordenados = new LinkedList<Soldado>(this.soldados);
		Collections.sort(ordenados, new VelocidadComparator());
		return ordenados;
	}

	public List<Soldado> formacionPorTropa() {
		List<Soldado> ordenados = new LinkedList<Soldado>(this.soldados);
		Collections.sort(ordenados, new TipoComparator());
		return ordenados;
	}

	public Map<TipoSoldado, List<Soldado>> agrupar() {

		Map<TipoSoldado, List<Soldado>> mapa = new HashMap<TipoSoldado, List<Soldado>>();

		List<Soldado> listaHoplitas = new LinkedList<Soldado>();
		List<Soldado> listaHondero = new LinkedList<Soldado>();
		List<Soldado> listaLanzajabalinas = new LinkedList<Soldado>();
		List<Soldado> listaCaballero = new LinkedList<Soldado>();
		List<Soldado> listaArquero = new LinkedList<Soldado>();

		for (int i = 0; i < soldados.size(); i++) {
			switch (this.soldados.get(i).getTipo()) {
			case HOPLITAS:
				listaHoplitas.add(this.soldados.get(i));
				break;
			case HONDEROS:
				listaHondero.add(this.soldados.get(i));
				break;
			case LANZADORESDEJABALINAS:
				listaLanzajabalinas.add(this.soldados.get(i));
				break;
			case CABALLEROS:
				listaCaballero.add(this.soldados.get(i));
				break;
			case ARQUEROS:
				listaArquero.add(this.soldados.get(i));
				break;
			}
		}

		mapa.put(TipoSoldado.HOPLITAS, listaHoplitas);
		mapa.put(TipoSoldado.HONDEROS, listaHondero);
		mapa.put(TipoSoldado.LANZADORESDEJABALINAS, listaLanzajabalinas);
		mapa.put(TipoSoldado.CABALLEROS, listaCaballero);
		mapa.put(TipoSoldado.ARQUEROS, listaArquero);

		return mapa;
	}

	public Set<Soldado> representantes() {
		Set<Soldado> representantes = new HashSet<Soldado>();
		for(int i = 0 ; i < this.soldados.size() ; i++) {
			representantes.add(this.soldados.get(i));
		}
		return representantes;
	}

	public void mostrar() {
		for (int i = 0; i < this.soldados.size(); i++) {
			System.out.println("Soldado " + (i + 1) + "\nTipo: " + this.soldados.get(i).getTipo());
			System.out.println(
					"Región: " + this.soldados.get(i).getRegion() + "\nRango: " + this.soldados.get(i).getRango());
			System.out.println("Velocidad: " + this.soldados.get(i).getVelocidad() + "\n");
		}
	}
}
