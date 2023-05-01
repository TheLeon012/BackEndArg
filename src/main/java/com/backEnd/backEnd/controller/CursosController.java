package com.backEnd.backEnd.controller;


import com.backEnd.backEnd.models.Cursos;
import com.backEnd.backEnd.services.CursosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursosController {

    private final CursosService cursosService;


    public CursosController(CursosService cursosService) {
        this.cursosService = cursosService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cursos>> obtenerEducacion(){
        List <Cursos> cursos = cursosService.buscarCurso();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Cursos> editarCurso(@RequestBody Cursos cursos){
        Cursos updateCurso=cursosService.editarCursos(cursos);
        return new ResponseEntity<>(updateCurso, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cursos> crearCurso(@RequestBody Cursos cursos){
        Cursos nuevaCurso=cursosService.addCurso(cursos);
        return new ResponseEntity<>(nuevaCurso, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public  ResponseEntity<?> borrarCurso(@PathVariable("id") Long id){
        cursosService.borrarCurso(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}