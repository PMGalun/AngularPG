
package com.PryectoPMG.V2.Security.Service;

import com.PryectoPMG.V2.Security.Entity.Rol;
import com.PryectoPMG.V2.Security.Enums.RolNombre;
import com.PryectoPMG.V2.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
    return iRolRepository .findByRolNombre(rolNombre);        
}

public void save (Rol rol){
    iRolRepository.save(rol);
}
}
