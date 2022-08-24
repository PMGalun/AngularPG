
package com.PryectoPMG.V2.Security.Repository;

import com.PryectoPMG.V2.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String NombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

    public boolean existByNombreUsuario(String nombreUsuario);

    public boolean existByEmail(String email);
}
