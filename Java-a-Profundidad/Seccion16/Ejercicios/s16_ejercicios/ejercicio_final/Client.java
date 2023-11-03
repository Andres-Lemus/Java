package s16_ejercicios.ejercicio_final;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		try (Socket socket = new Socket("localhost",8080);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				ObjectInputStream dis = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
			String mensaje = null;
			Boolean enviado = false;
			Persona personaPedida = new Persona();
			do {

				if (enviado) {
					personaPedida = (Persona) dis.readObject();
					System.out.println(personaPedida);

					do {
						System.out.println("Dato a modifcar de la persona");
						mensaje = readMessage();
						switch (mensaje.toLowerCase()){
							case "nombre":
								System.out.println("Nuevo nombre:");
								mensaje = readMessage();
								personaPedida.setNombre(mensaje);
								break;
							case "apellido":
								System.out.println("Nuevo apellido:");
								mensaje = readMessage();
								personaPedida.setApellido(mensaje);
								break;
							case "edad":
								System.out.println("Nueva edad:");
								mensaje = readMessage();
								personaPedida.setEdad(Integer.parseInt(mensaje));
								break;
							case "telefono":
								System.out.println("Nuevo telefono:");
								mensaje = readMessage();
								personaPedida.setTelefono(mensaje);
								break;
							case "enviar":
								break;
							default:
								System.out.println("Ingrese el nombre de un dato valido para modificar");
								break;
						}
					} while (!"enviar".equals(mensaje.toLowerCase()));
					
					oos.writeObject(personaPedida);
					personaPedida = new Persona();
					enviado = false;
				}
				if (personaPedida.getEmail() == null) {
					System.out.println("Email de la persona a modificar:");
					mensaje = readMessage();
					dos.writeUTF(mensaje);
					enviado = true;
				}					
				
			} while (!"salir".equals(mensaje.toLowerCase()));
		}
	}

}
