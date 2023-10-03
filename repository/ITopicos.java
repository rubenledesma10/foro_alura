
package com.example.foroAlura.repository;

import com.example.foroAlura.model.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicos extends JpaRepository<Topicos, Long> {
    
}
