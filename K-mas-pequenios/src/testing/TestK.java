package testing;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import kmaspequenios.KMasPequenios;

public class TestK {

	@Test
	public void testCaso01() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/01_MásNúmerosQueBuscados.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/01_MásNúmerosQueBuscados.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso02() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/02_MásNúmerosDistintosQueBuscados.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/02_MásNúmerosDistintosQueBuscados.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso03() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/03_NúmerosNoMuyPequeños.in");
		File salida = new File(
				"Ejecución de Prueba/Salida Producida/03_NúmerosNoMuyPequeños.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso04() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/04_MenosNúmerosQueBuscados.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/04_MenosNúmerosQueBuscados.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso05() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/05_TodosLosNúmerosSonLosKMásPequeños.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/05_TodosLosNúmerosSonLosKMásPequeños.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso06() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/06_TodosLosNúmerosSonDistintos.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/06_TodosLosNúmerosSonDistintos.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso07() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/07_TodosLosNúmerosSonIguales.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/07_TodosLosNúmerosSonIguales.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso08() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/08_TodosPositivos.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/08_TodosPositivos.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso09() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/09_TodosNegativos.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/09_TodosNegativos.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso10() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/10_OrdenadosAscendentemente.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/10_OrdenadosAscendentemente.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso11() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/11_OrdenadosDescendentemente.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/11_OrdenadosDescendentemente.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso12() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/12_Fatiga.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/12_Fatiga.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
}
