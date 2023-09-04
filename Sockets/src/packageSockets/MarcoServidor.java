package packageSockets;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class MarcoServidor extends JFrame implements Runnable {

	public MarcoServidor() {
		setResizable(false);
		setTitle("Servidor");

		setBounds(1200, 300, 488, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		getContentPane().add(milamina);

		setVisible(true);

		Thread hilo = new Thread(this);
		hilo.start();
	}

	private JTextArea areatexto;

	@SuppressWarnings("resource")
	@Override
	public void run() {
		try {
			// se crea un socket servidor que quedar� a la escucha por el puerto
			// 9999
			ServerSocket servidor = new ServerSocket(9999);
			
			// variable para leer los datos recibidos
			String nick, ip, msg;
			
			// creo una lista para guardar las ips de los clientes que se conectan
			ArrayList<String> listaIp = new ArrayList<String>();

			// se instancia un nuevo paquete donde recibir� el paquete que
			// me env�an
			PaqueteEnvio paquete;

			// se aceptar�n conexiones de forma infinita
			while (true) {
				// se crea un socket en el que se aceptan conexiones de clientes
				// al servidor
				Socket server = servidor.accept();

				// se crea un flujo de entrada para objeto con el flujo de
				// entrada del socket
				ObjectInputStream paqueteDatos = new ObjectInputStream(server.getInputStream());

				// se guarda en el packete el objeto que tiene el flujo de
				// entrada
				paquete = (PaqueteEnvio) paqueteDatos.readObject();

				// con los datos del paquete se cargan las variables
				nick = paquete.getNick();
				ip = paquete.getIp();
				msg = paquete.getMsg();

				/*
				 * // se crea un flujo de entrada con el flujo de entrada del
				 * socket server DataInputStream flujoEntrada = new
				 * DataInputStream(server.getInputStream());
				 * 
				 * // se lee el contenido del flujo String msg =
				 * flujoEntrada.readUTF();
				 * 
				 * // se concatena el msg en el textArea areatexto.append("\n" +
				 * msg);
				 * 
				 */
				
				if (!msg.equals(" online")) {
					// se concatena el mensaje en el area de texto, con todos los
					// datos recibidos
					areatexto.append("\n" + nick + ": " + msg + " para " + ip);
					
					// se crea un nuevo socket con los datos del destinatario
					Socket enviaADestinatario = new Socket(ip, 9090);
					
					// se crea un paquete de reenvio con el flujo de salida para objetos del socket del destinatario
					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaADestinatario.getOutputStream());
					
					// se escribe el paquete recibido en el flujo del paquete de reenvio
					paqueteReenvio.writeObject(paquete);
					
					// cierro el flujo
					paqueteReenvio.close();
					
					// se cierra el socket para el destinatario
					enviaADestinatario.close();

					// se cierra el socket del servidor
					server.close();
				} else {
					// obtengo la direcci�n ip remota del cliente que se conecta
					InetAddress localizacion = server.getInetAddress();
					String ipRemota = localizacion.getHostAddress();
					System.out.println("Online " + ipRemota);
					
					// agrego la ip del nuevo cliente conectado a la lista de ips
					listaIp.add(ipRemota);
					// agrego la lista de ips al paquete
					paquete.setIps(listaIp);
					
					for (String z: listaIp) {
						System.out.println("Array: " + z);
						
						// se crea un nuevo socket con los datos del destinatario
						Socket enviaADestinatario = new Socket(z, 9090);
						
						// se crea un paquete de reenvio con el flujo de salida para objetos del socket del destinatario
						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaADestinatario.getOutputStream());
						
						// se escribe el paquete recibido en el flujo del paquete de reenvio
						paqueteReenvio.writeObject(paquete);
						
						// cierro el flujo
						paqueteReenvio.close();
						
						// se cierra el socket para el destinatario
						enviaADestinatario.close();

						// se cierra el socket del servidor
						server.close();
					}
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
