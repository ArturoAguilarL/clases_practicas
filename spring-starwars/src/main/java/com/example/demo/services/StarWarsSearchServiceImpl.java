package com.example.demo.services;

import com.example.demo.dto.PersonajePorBusquedaDTO;
import com.example.demo.dto.PersonajeDTO;
import com.example.demo.dto.PersonajeResponseDTO;
import com.example.demo.repositories.StarWarsSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StarWarsSearchServiceImpl implements StarWarsSearchService {

    @Autowired
    private final StarWarsSearchRepository swRepositorio;

    public StarWarsSearchServiceImpl(StarWarsSearchRepository swRepositorio) {
        this.swRepositorio = swRepositorio;
    }

    @Override
    public PersonajeResponseDTO buscar(PersonajeDTO pj) {
        PersonajeResponseDTO response = new PersonajeResponseDTO();
        Map<String, Double> caloriasPorIngrediente = new HashMap<>();
        List<PersonajePorBusquedaDTO> personajes = swRepositorio.buscarNombresSimilares(pj.getNombre());
        response.setPersonajes(personajes);
        return response;
    }
}
