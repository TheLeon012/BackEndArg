package com.backEnd.backEnd.controller;


import com.backEnd.backEnd.models.Experiencia;
import com.backEnd.backEnd.services.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;


    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List <Experiencia> experiencia = experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearEducacion(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public  ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
