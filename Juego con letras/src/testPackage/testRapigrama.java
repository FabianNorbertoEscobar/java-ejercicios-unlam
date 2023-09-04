package testPackage;

import org.junit.Test;

import miPaquete.Rapigrama;

public class testRapigrama {

	@Test
	public void testRapigrama00() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/00_CasoEjemplo/entrada/rapigrama.in");
		rapigrama.buscar("Lote de Prueba/Ejecuci�n de la Prueba/00_CasoEjemplo/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama01() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/01_NoSeEncuentraLaPalabra/entrada/rapigrama.in");
		rapigrama.buscar("Lote de Prueba/Ejecuci�n de la Prueba/01_NoSeEncuentraLaPalabra/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama02() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/02_LaPalabraEst�RepetidaVariasVeces/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/02_LaPalabraEst�RepetidaVariasVeces/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama03() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/03_LaPalabraEst�VariasVecesEnUnaMismaL�nea/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/03_LaPalabraEst�VariasVecesEnUnaMismaL�nea/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama04() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/04_PalabrasSuperpuestas/entrada/rapigrama.in");
		rapigrama.buscar("Lote de Prueba/Ejecuci�n de la Prueba/04_PalabrasSuperpuestas/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama05() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/05_LaPalabraOcupaTodaLaFilaColumna/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/05_LaPalabraOcupaTodaLaFilaColumna/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama06() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/06_CuadrillaFormadaCompletamentePorLaPalabra/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/06_CuadrillaFormadaCompletamentePorLaPalabra/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama07() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/07_PalabrasABuscarEst�nSoloAlRev�s/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/07_PalabrasABuscarEst�nSoloAlRev�s/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama08() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/08_CasoDeFatigaDimensi�nDelTablero/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/08_CasoDeFatigaDimensi�nDelTablero/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama09() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/09_CasoDeFatigaCantidadDePalabrasM�xima/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/09_CasoDeFatigaCantidadDePalabrasM�xima/salida/rapigrama.out");
	}

	@Test
	public void testRapigrama10() {
		Rapigrama rapigrama = new Rapigrama(
				"Lote de Prueba/Ejecuci�n de la Prueba/10_CasoDeFatigaLongitudM�ximaDePalabra/entrada/rapigrama.in");
		rapigrama.buscar(
				"Lote de Prueba/Ejecuci�n de la Prueba/10_CasoDeFatigaLongitudM�ximaDePalabra/salida/rapigrama.out");
	}

}
