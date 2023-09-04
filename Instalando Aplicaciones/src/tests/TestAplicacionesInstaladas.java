package tests;

import org.junit.Test;

import miPackage.AplicacionesInstaladas;

public class TestAplicacionesInstaladas {

	@Test
	public void testCaso0() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/00_CasoDelEnunciado/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/00_CasoDelEnunciado/salidaProducida/almacenamiento.out");
	}
	
	@Test
	public void testCaso1() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/01_TodosSonElTamañoDeLaAplicación/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/01_TodosSonElTamañoDeLaAplicación/salidaProducida/almacenamiento.out");
	}
	
	@Test
	public void testCaso2() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/02_LaMemoriaNoAlcanzaParaInstalarLaApp/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/02_LaMemoriaNoAlcanzaParaInstalarLaApp/salidaProducida/almacenamiento.out");
	}
	
	@Test
	public void testCaso3() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/03_HayVariasQueSumanLoMismo/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/03_HayVariasQueSumanLoMismo/salidaProducida/almacenamiento.out");
	}
	
	@Test
	public void testCaso4() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/04_TodasSumanLoMismo/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/04_TodasSumanLoMismo/salidaProducida/almacenamiento.out");
	}
	
	@Test
	public void testCaso5() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/05_EmpateConValoresDiferentes/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/05_EmpateConValoresDiferentes/salidaProducida/almacenamiento.out");
	}
	
	
	@Test
	public void testCaso6() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/06_FatigaEnCantidadDeAplicaciones/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/06_FatigaEnCantidadDeAplicaciones/salidaProducida/almacenamiento.out");
	}
	
	
	@Test
	public void testCaso7() {
		AplicacionesInstaladas appsInstaladas = new AplicacionesInstaladas("Lote de prueba/07_CasoFatigaMáximoTamañoDeApliación/entrada/almacenamiento.in");
		appsInstaladas.seleccionarAplicaciones();
		appsInstaladas.escribirSolucion("Lote de prueba/07_CasoFatigaMáximoTamañoDeApliación/salidaProducida/almacenamiento.out");
	}
}
