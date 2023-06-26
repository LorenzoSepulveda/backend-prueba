package com.portfolio.ls.Repository;

import com.portfolio.ls.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lor_b
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
    
}
