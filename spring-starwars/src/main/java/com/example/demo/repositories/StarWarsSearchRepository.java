package com.example.demo.repositories;

import com.example.demo.dto.PersonajePorBusquedaDTO;

import java.util.List;

public interface StarWarsSearchRepository {

    List<PersonajePorBusquedaDTO> buscarNombresSimilares(String nombre);

}
