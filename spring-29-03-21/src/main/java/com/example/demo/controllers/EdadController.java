package com.example.demo.controllers;

import com.example.demo.services.CasasServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personajes")
public class EdadController {

    //multiples parametros
    @GetMapping("{}nombre")
    public ResponseEntity obtenerInfo(@PathVariable String nombre){
        return CasasServices.buscarPersonaje(nombre);
    }

    @GetMapping("{casa}")
    public ResponseEntity obtenerCasa(@PathVariable String casa){
        return CasasServices.buscarCasa(casa);
    }
}


/*
   public ResponseEntity obtenerin(@PathVariable int day, @PathVariable int month, @PathVariable int year){
        EdadServices.convertirEdad(day, month, year);
        return null;
    }
 */