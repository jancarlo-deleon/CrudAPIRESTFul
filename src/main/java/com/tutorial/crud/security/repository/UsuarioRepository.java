package com.tutorial.crud.security.repository;

import com.tutorial.crud.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jan Carlo
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
