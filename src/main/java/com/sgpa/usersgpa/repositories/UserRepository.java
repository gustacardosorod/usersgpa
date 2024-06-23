package com.sgpa.usersgpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgpa.usersgpa.entities.Paciente;

public interface UserRepository extends JpaRepository<Paciente, Long> {
    
}
