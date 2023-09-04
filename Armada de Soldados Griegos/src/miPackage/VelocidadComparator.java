package miPackage;

import java.util.Comparator;

public class VelocidadComparator implements Comparator<Soldado> {

	@Override
	public int compare(Soldado soldado1, Soldado soldado2) {
		return (int) (soldado1.getVelocidad() - soldado2.getVelocidad());
	}

}
