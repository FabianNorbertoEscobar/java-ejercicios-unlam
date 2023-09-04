package tests;

import org.junit.Test;

import pack.Pedregal;

public class TestPedregal {

	@Test
	public void testCaso00() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/00_CasoEjemplo/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/00_CasoEjemplo/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso01() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/01_LaCasaCabeJustoEnElPedregalPeroLosPe�ascosEstorban/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/01_LaCasaCabeJustoEnElPedregalPeroLosPe�ascosEstorban/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso02() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/02_LaCasaNoCabeEnElPedregal/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/02_LaCasaNoCabeEnElPedregal/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso03() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/03_LaCasaCabeYTodosLosCasillerosNoOcupadosTienenPe�ascos/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/03_LaCasaCabeYTodosLosCasillerosNoOcupadosTienenPe�ascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso04() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/04_SoloHayUnaUbicaci�nParaLaCasa/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/04_SoloHayUnaUbicaci�nParaLaCasa/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso05() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/05_TodoElTerrenoTienePe�ascos/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/05_TodoElTerrenoTienePe�ascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso06() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/06_Pe�ascosEnLasPuntasYEnElCentro/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/06_Pe�ascosEnLasPuntasYEnElCentro/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso07() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/07_VariasUbicacionesPosiblesParaLaCasa/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/07_VariasUbicacionesPosiblesParaLaCasa/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso08() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/08_LaCasaSoloCabeEnLasFronterasDelTerreno/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/08_LaCasaSoloCabeEnLasFronterasDelTerreno/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso09() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/09_LaCasaCaber�aSiSeVoltease/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/09_LaCasaCaber�aSiSeVoltease/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso10() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/10_CasoFatiga1000Pe�ascos/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/10_CasoFatiga1000Pe�ascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso11() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/11_CasoFatigaCasaConUnaDimensi�nM�xima/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/11_CasoFatigaCasaConUnaDimensi�nM�xima/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso12() {
		Pedregal pedregal = new Pedregal("Lote de Prueba/12_CasoFatigaTerrenoConUnaDimensi�nM�xima/entrada/pedregal.in");
		pedregal.resolucion("Lote de Prueba/12_CasoFatigaTerrenoConUnaDimensi�nM�xima/salida producida/pedregal.out");
	}
	
}
