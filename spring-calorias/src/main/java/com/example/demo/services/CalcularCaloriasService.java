package com.example.demo.services;

import com.example.demo.dto.PlatoDTO;
import com.example.demo.dto.PlatoResponseDTO;

public interface CalcularCaloriasService {

    PlatoResponseDTO calcular(PlatoDTO plato);
}
