package com.example.demo.controllers;


import com.example.demo.dto.PlatoDTO;
import com.example.demo.dto.PlatoResponseDTO;
import com.example.demo.services.CalcularCaloriasService;
import com.example.demo.services.CalcularCaloriasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CalculadoraCaloriasController {

    @Autowired
    private CalcularCaloriasServiceImpl calcularCaloriasService;
    
    @PostMapping("/calcular")
    public PlatoResponseDTO getCals(@RequestBody PlatoDTO plato){
        return calcularCaloriasService.calcular(plato);
    }
    

}
