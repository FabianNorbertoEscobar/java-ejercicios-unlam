package piratas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PirataEstadosTest {

	Pirata pirata;

	@Before
	public void queSeInstancia() {
		this.pirata = new Pirata();
	}

	@Test
	public void quePirataNaceSaludable() {
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queHiperSaludableSiSaludableBebeJugo() {
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.HIPERSALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queSaludableSiSaludableSoloBebeUnGrog() {
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queSaludableSiSaludableBebeDosGrog() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queEscorbutoSiSaludableBebeTresGrog() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.ESCORBUTO, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queSaludableSiEscorbutoBebeJugo() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.ESCORBUTO, this.pirata.getEstado().getEstadoPirata());
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queSaludableSiHiperSaludableBebeGrog() {
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.HIPERSALUDABLE, this.pirata.getEstado().getEstadoPirata());
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.SALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queEscorbutoSiEscorbutoBebeGrog() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.ESCORBUTO, this.pirata.getEstado().getEstadoPirata());
		this.pirata.beberGrog();
		Assert.assertEquals(EstadoPirata.ESCORBUTO, this.pirata.getEstado().getEstadoPirata());
	}

	@Test
	public void queHiperSaludableSiHiperSaludableBebeJugo() {
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.HIPERSALUDABLE, this.pirata.getEstado().getEstadoPirata());
		this.pirata.beberJugo();
		Assert.assertEquals(EstadoPirata.HIPERSALUDABLE, this.pirata.getEstado().getEstadoPirata());
	}

}
