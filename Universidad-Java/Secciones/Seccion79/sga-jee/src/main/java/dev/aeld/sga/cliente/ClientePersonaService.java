package dev.aeld.sga.cliente;

import dev.aeld.sga.domain.Persona;
import dev.aeld.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB al cliente\n");
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!dev.aeld.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersona();
            for (Persona persona : personas) {
                System.out.println(personas);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
