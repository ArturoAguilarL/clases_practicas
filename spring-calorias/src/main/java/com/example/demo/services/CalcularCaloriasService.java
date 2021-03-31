package com.example.demo.services;

import com.example.demo.dto.PlatoDTO;
import com.example.demo.dto.PlatoResponseDTO;
import com.example.demo.exceptions.IngredientNotFound;

public interface CalcularCaloriasService  {

    PlatoResponseDTO calcular(PlatoDTO plato) throws IngredientNotFound;
}
