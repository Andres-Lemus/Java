package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEjb;
            holaMundoEjb = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjnImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjb.sumar(5, 3);
            System.out.println("Resultado EJB suma 5+3: " + resultado);
        } catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
