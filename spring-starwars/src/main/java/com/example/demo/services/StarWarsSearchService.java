package com.example.demo.services;

import com.example.demo.dto.PersonajeDTO;
import com.example.demo.dto.PersonajeResponseDTO;

public interface StarWarsSearchService {

    PersonajeResponseDTO buscar(PersonajeDTO pj);
}
