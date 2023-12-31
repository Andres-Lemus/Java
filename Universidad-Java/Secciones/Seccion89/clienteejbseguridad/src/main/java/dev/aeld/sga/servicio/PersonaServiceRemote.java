package dev.aeld.sga.servicio;

import dev.aeld.sga.domain.Persona;
import java.util.List;

public interface PersonaServiceRemote {
    public List<Persona> listarPersona();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
