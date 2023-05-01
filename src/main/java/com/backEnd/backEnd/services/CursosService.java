package com.backEnd.backEnd.services;
import com.backEnd.backEnd.models.Cursos;
import com.backEnd.backEnd.repository.CursosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CursosService {

    private final CursosRepo cursosrepo;

    @Autowired
    public CursosService(CursosRepo cursosrepo){
        this.cursosrepo=cursosrepo;
    }

    public Cursos addCurso(Cursos cursos){
        return cursosrepo.save(cursos);
    }
    public List<Cursos> buscarCurso(){
        return cursosrepo.findAll();
    }

    public Cursos editarCursos(Cursos cursos){
        return cursosrepo.save(cursos);
    }

    public void borrarCurso(Long id){
        cursosrepo.deleteById(id);
    }
}
