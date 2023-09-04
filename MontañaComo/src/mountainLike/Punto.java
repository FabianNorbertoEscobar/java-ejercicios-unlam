package mountainLike;

public class Punto {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void trasladar(Punto punto) {
		this.x += punto.getX();
		this.y += punto.getY();
	}
}
