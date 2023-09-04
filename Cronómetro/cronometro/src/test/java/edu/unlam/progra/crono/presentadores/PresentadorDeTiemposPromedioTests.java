package edu.unlam.progra.crono.presentadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.unlam.progra.crono.AuxiliaresDeTesting;
import edu.unlam.progra.crono.Cronometro;
import edu.unlam.progra.crono.Precision;


public class PresentadorDeTiemposPromedioTests extends AuxiliaresDeTesting {

	private Cronometro crono;

	@Before
	public void setUp() {
		crono = new Cronometro(Precision.SEGUNDOS);
	}
	
	@Test
	public void funcionamientoConclicks() throws InterruptedException {

		crono.clic();
		simularProcesoDeXMilisegundos(100);
		crono.clic();
		simularProcesoDeXMilisegundos(50);
		crono.clic();

		PresentadorDeTiemposPromedio presentador = new PresentadorDeTiemposPromedio(crono.getMediciones());
		Assert.assertTrue(presentador.getResultado() >= 0.075);
		Assert.assertTrue(presentador.toString().matches("\\d\\.\\d{3} s"));

	}
}
