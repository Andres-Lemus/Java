package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;


public class TestPersonaServiceRS {
    private static final String URL_BASE = "http://localhost:8080/sga_jee_web/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        cliente = ClientBuilder.newClient();
        webTarget = cliente.target(URL_BASE).path("/personas");
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: "+persona);
        
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        System.out.println("\nPersonas recuperadas");
        imprimirPersonas(personas);
        
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Carlos");
        nuevaPersona.setApellido("Miranda");
        nuevaPersona.setEmail("cmiranda3@mail.com");
        nuevaPersona.setTelefono("99887700");
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada: "+personaRecuperada);
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        String pathId = "/"+personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        System.out.println("Persona modificada: "+response.readEntity(Persona.class));
        
        Persona personaEliminar = personaRecuperada;
        String pathEliminarId = "/"+personaEliminar.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminarId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println(response.getStatus());
        System.out.println("Persona eliminada: "+personaEliminar);
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona);
        }
    }
}
