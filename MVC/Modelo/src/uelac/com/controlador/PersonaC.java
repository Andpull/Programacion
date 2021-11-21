/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uelac.com.controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author LENOVO
 */
public class PersonaC {
    private List<Persona> listaPersona;

    public PersonaC() {
        listaPersona = new ArrayList();
    }
    
    public void Create(Persona personaC){
      listaPersona.add(personaC);
    }
    public void Read(){
        
    }
    public void Update(){
        
    }
    public void Delete(){
        
    }
            
}
