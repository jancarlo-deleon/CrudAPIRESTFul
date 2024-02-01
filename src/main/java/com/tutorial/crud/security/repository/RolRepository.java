package com.tutorial.crud.security.repository;

import com.tutorial.crud.security.enums.RolNombre;
import com.tutorial.crud.security.entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jan Carlo
 */
@Repository
public interface RolRepository extends JpaRepository<Rol,Integer>{
        Optional<Rol> findByRolNombre(RolNombre rolNombre);

    
}
