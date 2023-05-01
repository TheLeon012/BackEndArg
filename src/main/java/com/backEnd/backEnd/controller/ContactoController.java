package com.backEnd.backEnd.controller;


import com.backEnd.backEnd.models.Contacto;
import com.backEnd.backEnd.services.ContactoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {



    private final ContactoService contactoService;

    public ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Contacto>> obtenerProyectos(){
        List <Contacto> contacto = contactoService.buscarContacto ();
        return new ResponseEntity<>(contacto, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Contacto> editarProyectos(@RequestBody Contacto contacto){
        Contacto updateContacto=contactoService.editarContacto(contacto);
        return new ResponseEntity<>(updateContacto, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Contacto> crearProyecto(@RequestBody Contacto contacto){
        Contacto nuevoContacto=contactoService.addContacto(contacto);
        return new ResponseEntity<>(nuevoContacto, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public  ResponseEntity<?> borrarContacto(@PathVariable("id") Long id){
        contactoService.borrarContacto (id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

