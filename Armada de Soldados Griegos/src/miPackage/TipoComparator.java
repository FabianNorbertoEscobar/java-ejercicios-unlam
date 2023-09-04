package miPackage;

import java.util.Comparator;

public class TipoComparator implements Comparator<Soldado> {

	@Override
	public int compare(Soldado soldado1, Soldado soldado2) {
		if (soldado1.getTipo().ordinal() == soldado2.getTipo().ordinal()) {
			return new RangoComparator().compare(soldado1, soldado2);
		}
		return soldado1.getTipo().ordinal() - soldado2.getTipo().ordinal();
	}

}
