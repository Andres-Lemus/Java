package s16_ejercicios.ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class Server {

	public static void main(String[] args) throws IOException {
		try(ServerSocket socket = new ServerSocket(8080);){
			System.out.println("Escuchando peticiones...");
			Socket client =  socket.accept();
			System.out.printf("Cliente %s conectado \n",client.getInetAddress().getHostName());
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());

			try {				
				HTTPRequest peticion = (HTTPRequest) ois.readObject();
				Integer httpStatus;
				if (peticion.getBody() != null) {
					httpStatus = 200;
				} else {
					httpStatus = 204;
				}
				System.out.println("Body:\n"+peticion.getBody());
				System.out.println("\nHeader:");
				for (Map.Entry<String, String> header : peticion.getHeaders().entrySet()) {
					System.out.println(header.getKey() + ": " + header.getValue());
				}
				System.out.println("\nHTTPStatus: "+httpStatus);
				
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
