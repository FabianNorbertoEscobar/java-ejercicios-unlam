package piratas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AtaquesPiratasTest {

	Pirata pirataSaludable;
	Pirata pirataEscorbuto;
	Pirata pirataHiperSaludable;

	@Before
	public void queSeInstancian() {
		this.pirataSaludable = new Pirata();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirataSaludable.getEstado().getEstadoPirata());

		this.pirataEscorbuto = new Pirata();
		this.pirataEscorbuto.beberGrog();
		this.pirataEscorbuto.beberGrog();
		this.pirataEscorbuto.beberGrog();
		Assert.assertEquals(EstadoPirata.ESCORBUTO, this.pirataEscorbuto.getEstado().getEstadoPirata());

		this.pirataHiperSaludable = new Pirata();
		this.pirataHiperSaludable.beberJugo();
		Assert.assertEquals(EstadoPirata.HIPERSALUDABLE, this.pirataHiperSaludable.getEstado().getEstadoPirata());
	}

	@Test
	public void queSaludableAtacaASaludable() {
		this.pirataSaludable.atacar(this.pirataSaludable);
		Assert.assertEquals(3, this.pirataSaludable.getPuntos());
	}

	@Test
	public void queSaludableAtacaAEscorbuto() {
		this.pirataSaludable.atacar(this.pirataEscorbuto);
		Assert.assertEquals(5, this.pirataSaludable.getPuntos());
	}

	@Test
	public void queSaludableAtacaAHiperSaludable() {
		this.pirataSaludable.atacar(this.pirataHiperSaludable);
		Assert.assertEquals(7, this.pirataSaludable.getPuntos());
	}

	@Test
	public void queEscorbutoAtacaASaludable() {
		this.pirataEscorbuto.atacar(this.pirataSaludable);
		Assert.assertEquals(0, this.pirataEscorbuto.getPuntos());
	}

	@Test
	public void queEscorbutoAtacaAEscorbuto() {
		this.pirataEscorbuto.atacar(this.pirataEscorbuto);
		Assert.assertEquals(2, this.pirataEscorbuto.getPuntos());
	}

	@Test
	public void queEscorbutoAtacaAHiperSaludable() {
		this.pirataEscorbuto.atacar(this.pirataHiperSaludable);
		Assert.assertEquals(4, this.pirataEscorbuto.getPuntos());
	}

	@Test
	public void queHiperSaludableAtacaASaludable() {
		this.pirataHiperSaludable.atacar(this.pirataSaludable);
		Assert.assertEquals(8, this.pirataHiperSaludable.getPuntos());
	}

	@Test
	public void queHiperSaludableAtacaAEscorbuto() {
		this.pirataHiperSaludable.atacar(this.pirataEscorbuto);
		Assert.assertEquals(10, this.pirataHiperSaludable.getPuntos());
	}

	@Test
	public void queHiperSaludableAtacaAHiperSaludable() {
		this.pirataHiperSaludable.atacar(this.pirataHiperSaludable);
		Assert.assertEquals(12, this.pirataHiperSaludable.getPuntos());
	}
}
