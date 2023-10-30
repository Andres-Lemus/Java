/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.aeld.sga.cliente.cascada;

import dev.aeld.sga.domain.Persona;
import dev.aeld.sga.domain.Usuario;
import javax.persistence.*;
import org.apache.logging.log4j.*;

/**
 *
 * @author aldac
 */
public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "55778822");
        Usuario usuario1 = new Usuario("hhernandez","123", persona1);
        
        em.persist(usuario1);
        tx.commit();
        
        log.debug("Persona: " + persona1);
        log.debug("Usuario: " + usuario1);
        
        em.close();
    }
}
