package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class PersonajeResponseDTO {
    private List<PersonajePorBusquedaDTO> personajes;
}
