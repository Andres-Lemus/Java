package dev.aeld.sga.cliente.ciclovidajpa;

import dev.aeld.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "13135566");
        tx.begin();
        em.persist(persona1);
        
        log.debug("Objeto persistido - aun sin commit: " + persona1);
        
        tx.commit();
        
        log.debug("Objeto persistido - estado detachado: " + persona1);
        em.close();
    }
}
