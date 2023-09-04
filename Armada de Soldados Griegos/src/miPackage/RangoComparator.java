package miPackage;

import java.util.Comparator;

public class RangoComparator implements Comparator<Soldado> {

	@Override
	public int compare(Soldado soldado1, Soldado soldado2) {
		return soldado1.getRango() - soldado2.getRango();
	}

}
