package miPackage;

@SuppressWarnings("rawtypes")
public class AplicacionesADesinstalar implements Comparable {

	private int cantidadApps;
	private int tama�oApps;
	private int posPrimerApp;

	public int getCantidadApps() {
		return cantidadApps;
	}

	public void setCantidadApps(int cantidadApps) {
		this.cantidadApps = cantidadApps;
	}

	public int getTama�oApps() {
		return tama�oApps;
	}

	public void setTama�oApps(int tama�oApps) {
		this.tama�oApps = tama�oApps;
	}

	public int getPosPrimerApp() {
		return posPrimerApp;
	}

	public void setPosPrimerApp(int posPrimerApp) {
		this.posPrimerApp = posPrimerApp;
	}

	public AplicacionesADesinstalar(int cantidadApps, int tama�oApps, int posPrimerApp) {
		this.cantidadApps = cantidadApps;
		this.tama�oApps = tama�oApps;
		this.posPrimerApp = posPrimerApp;
	}

	@Override
	public int compareTo(Object obj) {
		if (this.cantidadApps == ((AplicacionesADesinstalar) obj).cantidadApps)
			return this.tama�oApps - ((AplicacionesADesinstalar) obj).tama�oApps;
		return this.cantidadApps - ((AplicacionesADesinstalar) obj).cantidadApps;
	}
}
