package myPackage;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		PlanElectrico pe = new PlanElectrico("ciudades.in");
		pe.resolver();
		//pe.mostrarRecorrido();
		pe.grabarRecorridoEnArchivo("tendido.out");
		//pe.mostrarAristas();
	}

}
