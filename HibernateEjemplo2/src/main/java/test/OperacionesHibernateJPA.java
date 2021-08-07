/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;


public class OperacionesHibernateJPA {
    
    public static void main(String[] args) {
        
    //pruena de SELECT
    
        PersonaDAO personaDao = new PersonaDAO();// se crea instancia de PersonaDAO
        
        personaDao.listar(); // se ejcuta el metodo lsitar
       
    //pruena de SELECT    
        
        
    /*/pruena de INSERT

        Persona persona = new Persona();
        persona.setNombre("Tony");
        persona.setApellido("Stark");
        persona.setEmail("ironman@vengadores.com");
        persona.setTelefono("457894641");
        
        personaDao.insertar(persona);
    
    //pruena de INSERT*/
    
    //pruena de UPDATE
    
    Persona persona = new Persona();
        persona.setIdPersona(4); //establece el ID a recuperar 
    
    persona = personaDao.buscarPersonaId(persona);//busca la persona antes del update
        System.out.println("Persona encontrada : " + persona);
    
       
        persona.setEmail("asimov@fundacion.com");
        persona.setTelefono("78457745");
    
        personaDao.modificar(persona); // modifica el objeto con los nuevos valores
        personaDao.listar();
     //pruena de UPDATE
     
     /*/pruena de DELETE
     

       Persona persona = new Persona(); // tipo de objeto con el q se trabajara
        persona.setIdPersona(4); //establece el ID a recuperar 
    
       persona = personaDao.buscarPersonaId(persona);//busca la persona antes del update
        System.out.println("Persona encontrada : " + persona);
     
        personaDao.ELIMINAR(persona); //eliminamos el objeto 
        personaDao.ELIMINAR(15); //tambien puede ser directo con el idPersona
     
     //pruena de DELETE*/
     
     
    }
    
}
