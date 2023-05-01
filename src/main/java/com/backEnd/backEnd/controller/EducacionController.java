package com.backEnd.backEnd.controller;


import com.backEnd.backEnd.models.Educacion;
import com.backEnd.backEnd.services.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educacion")
public class EducacionController {

    private final EducacionService educacionService;


    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List <Educacion> educaciones = educacionService.buscarEducacion();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educaicon){
        Educacion nuevaEducacion=educacionService.addEducacion(educaicon);
        return new ResponseEntity<>(nuevaEducacion, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public  ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}