package com.example.demo.repositories;

import com.example.demo.dto.CaloriaPorIngredienteDTO;
import com.example.demo.exceptions.IngredientNotFound;

public interface CaloriasRepository {

    CaloriaPorIngredienteDTO encontrarCaloriaPorIngrediente(String nombre) throws IngredientNotFound;

}
