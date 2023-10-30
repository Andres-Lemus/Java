/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.aeld.sga.cliente.ciclovidajpa;

import dev.aeld.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author aldac
 */
public class EliminarObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Persona persona1 = em.find(Persona.class, 4);
        //em.remove(persona1);
        tx.commit();
        log.debug("Objeto encontrado: " + persona1);
        
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        em.remove(em.merge(persona1));
        tx2.commit();
        log.debug("Objeto eliminado: " + persona1);
        
        em.close();
    }
}
