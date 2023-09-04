package testing;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import kmaspequenios.KMasPequenios;

public class TestK {

	@Test
	public void testCaso01() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/01_M�sN�merosQueBuscados.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/01_M�sN�merosQueBuscados.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso02() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/02_M�sN�merosDistintosQueBuscados.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/02_M�sN�merosDistintosQueBuscados.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso03() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/03_N�merosNoMuyPeque�os.in");
		File salida = new File(
				"Ejecuci�n de Prueba/Salida Producida/03_N�merosNoMuyPeque�os.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso04() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/04_MenosN�merosQueBuscados.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/04_MenosN�merosQueBuscados.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso05() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/05_TodosLosN�merosSonLosKM�sPeque�os.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/05_TodosLosN�merosSonLosKM�sPeque�os.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso06() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/06_TodosLosN�merosSonDistintos.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/06_TodosLosN�merosSonDistintos.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso07() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/07_TodosLosN�merosSonIguales.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/07_TodosLosN�merosSonIguales.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso08() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/08_TodosPositivos.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/08_TodosPositivos.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso09() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/09_TodosNegativos.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/09_TodosNegativos.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso10() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/10_OrdenadosAscendentemente.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/10_OrdenadosAscendentemente.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso11() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/11_OrdenadosDescendentemente.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/11_OrdenadosDescendentemente.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
	
	@Test
	public void testCaso12() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/12_Fatiga.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/12_Fatiga.out");
		KMasPequenios campamento = new KMasPequenios(entrada, salida);
		campamento.resolver();
	}
}
