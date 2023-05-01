package com.backEnd.backEnd.controller;



import com.backEnd.backEnd.models.Skills;
import com.backEnd.backEnd.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill")
public class SkillsController {

    private final SkillsService skillsService;


    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List <Skills> skills = skillsService.buscarSkills ();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skills> editarExperiencia(@RequestBody Skills skills){
        Skills updateSkills=skillsService.editarSkill(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkills=skillsService.addSkill(skills);
        return new ResponseEntity<>(nuevaSkills, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public  ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.borrarSkill (id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
