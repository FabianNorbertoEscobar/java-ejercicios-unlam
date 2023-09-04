package conexiones;

public class MiThread extends Thread {

	public MiThread(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + getName());
		}
		System.out.println("Terminó " + getName());
	}

}
