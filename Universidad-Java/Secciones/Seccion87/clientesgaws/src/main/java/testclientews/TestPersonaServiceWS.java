/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

/**
 *
 * @author aldac
 */
public class TestPersonaServiceWS {
    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        List<Persona> personas = personaService.listarPersona();
        for (Persona persona : personas) {
            System.out.println("Persona idePersona: "+persona.getIdPersona()+", nombre: "+persona.getNombre()+", apellido: "+persona.getApellido()+
                    ", email: "+persona.getEmail());
        }
        System.out.println("Fin de servicio listar personas");
    }
}
