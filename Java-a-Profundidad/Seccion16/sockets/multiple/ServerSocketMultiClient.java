package sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkerSocket extends Thread {
	private Socket client;

	public WorkerSocket(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try (DataInputStream dis = new DataInputStream(client.getInputStream())){
			String mensaje = null;
			do {
				mensaje = dis.readUTF();
				System.err.printf("%s dice: %s \n", client.getInetAddress().getHostName(), mensaje);
			} while (!"salir".equals(mensaje));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
}

public class ServerSocketMultiClient {

	public static void main(String[] args) throws IOException {
		try (ServerSocket ss = new ServerSocket(8090);) {
			while (true) {
				System.out.println("Escuchando clientes...");
				Socket client = ss.accept();
				System.out.println("Cliente conectado: " + client.getInetAddress().getHostName());
				new WorkerSocket(client).start();;
			}
		}

	}

}
