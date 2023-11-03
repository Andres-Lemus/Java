package s16_ejercicios.ejercicio2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
	
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) {
		System.out.println("Ruta de archivo enviar a servidor:");
		String file="";
		try {
			file = readMessage();
			File f = new File(file);
			if (f.exists()) {
				try (Socket socket = new Socket("localhost",8080);
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
					//dos.writeUTF(file);
					oos.writeObject(f);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
