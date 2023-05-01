package com.backEnd.backEnd.repository;


import com.backEnd.backEnd.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ContactoRepo extends JpaRepository<Contacto, Long> {
}