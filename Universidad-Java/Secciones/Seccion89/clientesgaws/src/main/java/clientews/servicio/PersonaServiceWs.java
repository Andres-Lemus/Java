
package clientews.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonaServiceWs", targetNamespace = "http://servicio.sga.aeld.dev/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonaServiceWs {


    /**
     * 
     * @return
     *     returns java.util.List<clientews.servicio.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPersona", targetNamespace = "http://servicio.sga.aeld.dev/", className = "clientews.servicio.ListarPersona")
    @ResponseWrapper(localName = "listarPersonaResponse", targetNamespace = "http://servicio.sga.aeld.dev/", className = "clientews.servicio.ListarPersonaResponse")
    @Action(input = "http://servicio.sga.aeld.dev/PersonaServiceWs/listarPersonaRequest", output = "http://servicio.sga.aeld.dev/PersonaServiceWs/listarPersonaResponse")
    public List<Persona> listarPersona();

}
