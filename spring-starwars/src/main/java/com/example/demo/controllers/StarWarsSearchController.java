package com.example.demo.controllers;


import com.example.demo.dto.PersonajeDTO;
import com.example.demo.dto.PersonajeResponseDTO;
import com.example.demo.services.StarWarsSearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StarWarsSearchController {

    @Autowired
    private StarWarsSearchServiceImpl swSearchService;
    
    @PostMapping("/starwars")
    public PersonajeResponseDTO getPersonajes(@RequestBody PersonajeDTO pj){
        return swSearchService.buscar(pj);
    }
    

}
