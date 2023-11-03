package s16_ejercicios.ejercicio3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) throws IOException {
		try (Socket socket = new Socket("localhost",8080);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
			System.out.println("Enviando Objeto HTTPRequest al servidor");
			Map<String, String> header =  new HashMap<String, String>();
			header.put("user", "aeld");
			header.put("firstname", "andres");
			header.put("lastname", "lemus");
			oos.writeObject(new HTTPRequest(null,header));
			
		}
	}

}
