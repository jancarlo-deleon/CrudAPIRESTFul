package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Producto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Jan Carlo
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    
    Optional<Producto> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
    
}
