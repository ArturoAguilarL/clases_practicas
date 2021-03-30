package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {
    private String nombre;
    private double ancho;
    private double largo;
    private Double metrosCuadrados;

    public Habitacion(String nombre, Double ancho, Double largo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
        this.metrosCuadrados = 0.0;
    }
}
