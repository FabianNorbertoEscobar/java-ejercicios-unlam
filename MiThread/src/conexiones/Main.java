package conexiones;

public class Main {

	public static void main(String[] args) {
		MiThread robertoThread = new MiThread("Thread1");
		MiThread rigobertoThread = new MiThread("Thread2");
		robertoThread.start();
		rigobertoThread.start();
		System.out.println("Fin");
		
		Servidor servidor = new Servidor(10000);
		servidor.start();
		Cliente cliente1 = new Cliente("localhost", 10000);
		Cliente cliente2 = new Cliente("localhost", 10000);
		cliente1.start();
		cliente2.start();
	}
}
