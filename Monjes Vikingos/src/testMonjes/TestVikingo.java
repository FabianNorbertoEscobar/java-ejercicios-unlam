package testMonjes;

import org.junit.Test;

import junit.framework.Assert;
import monjes.*;

@SuppressWarnings("deprecation")
public class TestVikingo {

	@Test
	public void testSeCreaVikingo() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getAtaque(), 10);
		Assert.assertEquals(v.getDefensa(), 10);
		Assert.assertEquals(v.getSalud(), 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	@Test
	public void testMeditarUnaVezDesdeEstadoNatural() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.meditar();
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
	}
	
	@Test
	public void testMeditarTresVecesDesdeEstadoNatural() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.meditar();
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueMayorQuincePorCiento() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.recibirAtaque(20);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
	}
	
	@Test
	public void testMeditarUnaVezDesdeEstadoBerserker() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.recibirAtaque(20);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
		v.meditar();
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
	}
	
	@Test
	public void testMeditarTresVecesDesdeEstadoBerserker() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.recibirAtaque(20);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
		v.meditar();
		v.meditar();
		v.meditar();
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	@Test
	public void testRecibirAtaqueMayorCincoPorCientoDesdeEstadoMeditacion() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.meditar();
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
		v.recibirAtaque(6);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
	}
	
	
	@Test
	public void testRecibirAtaqueMenorCincoPorCientoDesdeEstadoMeditacion() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.meditar();
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
		v.recibirAtaque(4);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Meditacion().getEstadoActual());
	}
	
	@Test
	public void recibirAtaqueDesdeEstadoBerserker() {
		Vikingo v = new Vikingo(10, 10, 100);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Natural().getEstadoActual());
		v.recibirAtaque(20);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
		v.recibirAtaque(20);
		Assert.assertEquals(v.getEstado().getEstadoActual(), new Berserker().getEstadoActual());
	}
	
	@Test
	public void testMostrarMonjes() {
		Vikingo v = new Vikingo(10, 10, 100);
		v.recibirAtaque(20);
		v.mostrar();
		
		v.meditar();
		v.meditar();
		v.meditar();
		System.out.println();
		v.mostrar();
		
		v.meditar();
		System.out.println();
		v.mostrar();
	}
	
}
