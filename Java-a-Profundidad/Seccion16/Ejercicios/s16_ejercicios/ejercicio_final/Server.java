package s16_ejercicios.ejercicio_final;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Server {
	
	public static List<Persona> lista(){
		List<Persona> p = new ArrayList<>();
		p.add(new Persona("Andres", "Lemus", 22, "alemus@mail.com", "44556633"));
		p.add(new Persona("Nuvia", "Castillo", 31, "ncastillo@mail.com", "88551166"));
		p.add(new Persona("Pedro", "Fernandez", 27, "pfernandez@mail.com", "11552277"));
		p.add(new Persona("William", "Navarro", 44, "wnavarro@mail.com", "99442288"));
		p.add(new Persona("Valeria", "Martinez", 18, "vmartinez@mail.com", "66772211"));
		return p;
	}
	
	public static void printLista(List<Persona> personas) {
		System.out.println("Listado de personas:");
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
	
	public static String readMessage() throws IOException {
		System.out.println("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, EOFException {
		List<Persona> personas = lista();
		
		try(ServerSocket socket = new ServerSocket(8080);){
			System.out.println("Escuchando peticiones...");
			Socket client =  socket.accept();
			System.out.printf("Cliente %s conectado \n",client.getInetAddress().getHostName());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream oosClient = new ObjectInputStream(client.getInputStream());

			Boolean enviado = false;
			
			String mensaje = null;
			do {
				Persona personaPedida = new Persona();
				if (enviado) {

					personaPedida = (Persona) oosClient.readObject();
					System.out.println(personaPedida);
					for (int i = 0; i < personas.size(); i++) {
						if (personas.get(i).getEmail().equals(personaPedida.getEmail())) {
							personas.set(i, personaPedida);
							printLista(personas);
							enviado = false;
							break;
						}
					}
				}
				

				if (personaPedida.getEmail() == null) {
					Boolean encontrada = false;
					mensaje = dis.readUTF();
					
					for (Persona persona : personas) {
						if (persona.getEmail().equals(mensaje)) {
							personaPedida = persona;
							encontrada = true;
							break;
						}
					}
					
					if (encontrada) {
						System.out.println("Enviando Objeto de Persona requerida");
						oos.writeObject(personaPedida);
						enviado = true;
					} else {
						System.out.printf("%s dice: %s \n",client.getInetAddress().getHostName(),mensaje);
					}
				}

				
			} while(!"salir".equals(mensaje.toLowerCase()));
			System.out.println("Conexiones cerradas");
			client.close();
			dis.close();
			File f = new File("D:\\Documentos\\Bootcamp Consiti\\Java-a-profundidad\\Java-a-Profundidad\\Seccion16\\Ejercicios\\listaPersonas.txt");
			try(PrintWriter pw = new PrintWriter(f)) {
				for (Persona persona : personas) {
					pw.println(persona);
				}
			}
		}
	}

	
}
