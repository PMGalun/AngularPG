
package com.PryectoPMG.V2.Security.Service;

import com.PryectoPMG.V2.Security.Entity.Usuario;
import com.PryectoPMG.V2.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
   @Autowired
   iUsuarioRepository iusuarioRepository;
           
           public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
           return iusuarioRepository.findByNombreUsuario(nombreUsuario);}

public boolean existsByNombreUsuario(String nombreUsuario){
return iusuarioRepository.existByNombreUsuario(nombreUsuario);
}

public boolean existsByEmail(String email){
return iusuarioRepository.existByEmail(email);
}

public void save (Usuario usuario){
    iusuarioRepository.save(usuario);
}

    Object getNombreUsuario(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
