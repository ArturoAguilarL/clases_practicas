package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HarryPotter {
    private String nombre;
    private List<String> colores;
    private List<Estudiante> integrantes;

}
