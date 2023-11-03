package s16_ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static String readMessage() throws IOException {
		System.out.println("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		try(ServerSocket socket = new ServerSocket(8080);){
			System.out.println("Escuchando peticiones...");
			Socket client =  socket.accept();
			System.out.printf("Cliente %s conectado \n",client.getInetAddress().getHostName());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String mensaje = null;
			do {
				mensaje = dis.readUTF();
				switch (mensaje.toLowerCase()) {
				case "iniciar":
					System.out.println("Iniciando...");
					break;
				case "reiniciar":
					System.out.println("Reiniciando...");
					break;
				case "apagar":
					System.out.println("Apagando...");
					break;
				default:
					System.out.printf("%s dice: %s \n",client.getInetAddress().getHostName(),mensaje);
					break;
				}
			} while(!"apagar".equals(mensaje.toLowerCase()));
			System.out.println("Conexiones cerradas");
			//socket.close();
			client.close();
			dis.close();
		}
	

	}

}
