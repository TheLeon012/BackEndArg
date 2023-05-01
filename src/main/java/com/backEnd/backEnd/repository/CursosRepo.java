package com.backEnd.backEnd.repository;


import com.backEnd.backEnd.models.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CursosRepo extends JpaRepository<Cursos, Long> {
}
