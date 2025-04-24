package com.example.doBeckAoFront.repository;

import com.example.doBeckAoFront.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario>findByEmail(String email);
}
