package com.example.demo.controllers;

import com.example.demo.entities.Casa;
import com.example.demo.services.CasasServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/casas")
public class CasasController {
    @GetMapping("{casa}")
    public ResponseEntity obtenerCasa(@PathVariable String casa){
        return CasasServices.buscarCasa(casa);
    }
    
    @PostMapping("/metroscuadrados")
    public ResponseEntity calcularMetrosCuadrados(@RequestBody Casa casa){
        return CasasServices.calcularMetrosCuadrados(casa);
    }

}
    

