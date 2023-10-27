package sockets.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocket {
	
	public static String readMessage() throws IOException {
		System.out.println("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		try (Socket socket = new Socket("localhost",8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
			String mensaje = null;
			do {
				mensaje = readMessage();
				dos.writeUTF(mensaje);
			} while (!"salir".equals(mensaje));
		}
	}
}
