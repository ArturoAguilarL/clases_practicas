package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class PlatoResponseDTO {
    private Double caloriasTotales;
    private Map<String, Double> caloriasPorIngrediente;
    private IngredienteDTO ingredienteConMasCalorias;
}
