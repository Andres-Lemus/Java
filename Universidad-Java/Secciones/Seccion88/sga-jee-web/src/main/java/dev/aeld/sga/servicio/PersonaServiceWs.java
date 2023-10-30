package dev.aeld.sga.servicio;

import dev.aeld.sga.domain.Persona;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PersonaServiceWs {
    @WebMethod
    public List<Persona> listarPersona();
}
