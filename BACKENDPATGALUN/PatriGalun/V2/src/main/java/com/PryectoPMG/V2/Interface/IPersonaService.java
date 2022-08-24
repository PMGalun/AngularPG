
package com.PryectoPMG.V2.Interface;

import com.PryectoPMG.V2.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Operosna
    public void savePersona (Persona persona);
    
    //Eliminar objetos que buscamos por ID
    public void deletePersona (Long id);
        
    //Buscar persona por ID
    public Persona findPersona (Long id);
        
    }
