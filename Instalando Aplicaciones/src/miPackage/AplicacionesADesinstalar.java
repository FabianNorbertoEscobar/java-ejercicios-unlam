package miPackage;

@SuppressWarnings("rawtypes")
public class AplicacionesADesinstalar implements Comparable {

	private int cantidadApps;
	private int tamañoApps;
	private int posPrimerApp;

	public int getCantidadApps() {
		return cantidadApps;
	}

	public void setCantidadApps(int cantidadApps) {
		this.cantidadApps = cantidadApps;
	}

	public int getTamañoApps() {
		return tamañoApps;
	}

	public void setTamañoApps(int tamañoApps) {
		this.tamañoApps = tamañoApps;
	}

	public int getPosPrimerApp() {
		return posPrimerApp;
	}

	public void setPosPrimerApp(int posPrimerApp) {
		this.posPrimerApp = posPrimerApp;
	}

	public AplicacionesADesinstalar(int cantidadApps, int tamañoApps, int posPrimerApp) {
		this.cantidadApps = cantidadApps;
		this.tamañoApps = tamañoApps;
		this.posPrimerApp = posPrimerApp;
	}

	@Override
	public int compareTo(Object obj) {
		if (this.cantidadApps == ((AplicacionesADesinstalar) obj).cantidadApps)
			return this.tamañoApps - ((AplicacionesADesinstalar) obj).tamañoApps;
		return this.cantidadApps - ((AplicacionesADesinstalar) obj).cantidadApps;
	}
}
