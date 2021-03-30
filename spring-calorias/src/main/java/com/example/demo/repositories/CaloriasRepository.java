package com.example.demo.repositories;

import com.example.demo.dto.CaloriaPorIngredienteDTO;

public interface CaloriasRepository {

    CaloriaPorIngredienteDTO encontrarCaloriaPorIngrediente(String nombre);

}
