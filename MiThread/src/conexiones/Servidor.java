package conexiones;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread {

	private ServerSocket servidor;
	
	public Servidor(int puerto) {
		try {
			this.servidor = new ServerSocket(puerto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Socket cliente = this.servidor.accept();

				DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
				salida.writeUTF("Cliente " + i + ": Holaaa!!");
				salida.close();
				
				cliente.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.servidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
