package testing;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import principalPackage.NombresRepetidos;

public class TestNombesRepetidos {

	@Test
	public void testCaso01() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/01_M�sNombresQueLosM�sRepetidosBuscados.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/01_M�sNombresQueLosM�sRepetidosBuscados.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso02() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/02_MenosNombresQueLosM�sRepetidosBuscados.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/02_MenosNombresQueLosM�sRepetidosBuscados.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso03() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/03_MenosNombresDiferentesQueLosM�sRepetidosBuscados.in");
		File salida = new File(
				"Ejecuci�n de Prueba/Salida Producida/03_MenosNombresDiferentesQueLosM�sRepetidosBuscados.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso04() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/04_DosChicos.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/04_DosChicos.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso05() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/05_TodosLosNombresEst�nEntreLosM�sRepetidos.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/05_TodosLosNombresEst�nEntreLosM�sRepetidos.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso06() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/06_TodosLosChicosTienenElMismoNombre.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/06_TodosLosChicosTienenElMismoNombre.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso07() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/07_Fatiga.in");
		File salida = new File("Ejecuci�n de Prueba/Salida Producida/07_Fatiga.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

}
