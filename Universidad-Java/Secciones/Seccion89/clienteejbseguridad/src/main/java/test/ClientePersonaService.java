package test;

import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import dev.aeld.sga.domain.Persona;
import dev.aeld.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;

public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");

        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!dev.aeld.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersona();
            for (Persona persona : personas) {
                System.out.println("persona: "+ persona);
            }
            System.out.println("\nFin de la llamada al EJB desde el cliente");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
