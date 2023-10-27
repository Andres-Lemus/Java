package sockets.simple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AlgoServerSocket {

	public static void main(String[] args) throws IOException {
		try(ServerSocket socket = new ServerSocket(8090)){
			System.out.println("Escuchando peticiones...");
			Socket client =  socket.accept();
			System.out.printf("Cliente %s conectado \n",client.getInetAddress().getHostName());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String mensaje = null;
			do {
				mensaje = dis.readUTF();
				System.out.printf("%s dice : %s \n",client.getInetAddress().getHostName(),mensaje);
			} while(!"salir".equals(mensaje));
			System.out.println("Conexiones cerradas");
			//socket.close();
			client.close();
			dis.close();
		}
	}

}
