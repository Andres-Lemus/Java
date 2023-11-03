package s16_ejercicios.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
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
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			/*String mensaje = null;

			mensaje = ois.readObject();*/
			try {				
				File file = (File) ois.readObject();;
				if (file.exists()) {
					try (FileReader fr = new FileReader(file);
							BufferedReader br = new BufferedReader(fr);){
						String cadena = null;
						do {
							cadena = br.readLine();
							if (cadena != null) {
								System.out.println(cadena);
							}
						} while (cadena != null);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Conexiones cerradas");
			//socket.close();
			client.close();
			ois.close();
		}
	}

}
