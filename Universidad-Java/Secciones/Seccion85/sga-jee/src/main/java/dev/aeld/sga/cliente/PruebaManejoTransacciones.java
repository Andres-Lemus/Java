package dev.aeld.sga.cliente;

import dev.aeld.sga.domain.Persona;
import dev.aeld.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;
import org.apache.logging.log4j.*;



public class PruebaManejoTransacciones{
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        //List<Persona> personas = null;
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!dev.aeld.sga.servicio.PersonaServiceRemote");
            
            log.debug("Iniciando prueba Manejo transaccional PersonaService");
            
            //Buscar un objeto persona
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
            //personas = personaService.listarPersona();
            
            log.debug("Persona recuperada:" + persona1);
            //persona1.setApellido("cambio con error.....................................................................");
            persona1.setApellido("Perez");
            
            personaService.modificarPersona(persona1);
            
            log.debug("Persona modificada:" + persona1);
            log.debug("Fin de prueba EJB transaccional");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
