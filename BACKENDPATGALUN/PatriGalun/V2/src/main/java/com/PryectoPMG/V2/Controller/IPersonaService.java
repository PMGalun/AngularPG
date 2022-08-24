
package com.PryectoPMG.V2.Controller;

import com.PryectoPMG.V2.Entity.Persona;
import java.util.List;

public interface IPersonaService{
    //Traer lista

    public List<Persona>getPersona();   
    
    //Guarda obj tipo pers
    public void  savePersona (Persona persona);
    
    //Eliminar obj buscado por Id
    public void  deletePersona (Long id);
    
    //Buscar pers por Id
    public Persona findPersona (Long id);
        
}
