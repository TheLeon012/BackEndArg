package com.backEnd.backEnd.repository;


import com.backEnd.backEnd.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
