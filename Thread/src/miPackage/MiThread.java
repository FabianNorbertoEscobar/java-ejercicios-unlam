package miPackage;

public class MiThread extends Thread {

	MiThread(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "" + this.getName());
		}
		System.out.println("Termino Thread" + this.getName());
	}

	public static void main(String args[]) {
		MiThread h1 = new MiThread("Leo");
		MiThread h2 = new MiThread("Lucas");
		
		//con el método start se inicia el ciclo de vida del thread
		h1.start();
		h2.start();
		
		try {
			h1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			h2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// puedo sincronizar los Thread usando semáforos o asignando prioridades
		
	} // fin MiThread

}
