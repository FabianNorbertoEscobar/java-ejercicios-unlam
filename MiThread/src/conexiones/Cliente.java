package conexiones;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente extends Thread {

	private Socket cliente;
	
	public Cliente(String ip, int puerto) {
		try {
			this.cliente = new Socket(ip, puerto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			DataInputStream entrada = new DataInputStream(this.cliente.getInputStream());
			System.out.println(entrada.readUTF());
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.cliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
