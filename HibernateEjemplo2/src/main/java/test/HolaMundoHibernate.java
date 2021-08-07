/*
 * clase de prueba Hibernate
 */
package test;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;



public class HolaMundoHibernate {
    
    public static void main(String[] args) {
        
        //ejecucion de qwerty HQL de Hibernate
                                   //Perosna refiere a la clase no a la tabla x entity manager
         String hql = "SELECT p FROM Persona p";
        
                                                                            //s emenciona el nombre definido en el archivo de Percistence 
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager(); //objeto entity para conecxion con DB
        
        Query query = entityManager.createQuery(hql); // sea crea le query con el objeto que contiene la sentencia
        // se recupera la consulta en una lista tipo persona
        List<Persona> personas = query.getResultList();
        //insteramos la lista
        for(Persona p: personas){
         
            System.out.println("Persona:" + p);
            
        }
        
        
    }
    
}
