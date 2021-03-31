package com.example.demo.repositories;

import com.example.demo.exceptions.IngredientNotFound;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.dto.CaloriaPorIngredienteDTO;


import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


@Repository
public class CaloriasRepositoryImpl implements CaloriasRepository{

    @Override
    public CaloriaPorIngredienteDTO encontrarCaloriaPorIngrediente(String nombre) throws IngredientNotFound {
        List<CaloriaPorIngredienteDTO> caloriasDTOS = loadDataBase();
        CaloriaPorIngredienteDTO resultado = null;
        if(caloriasDTOS != null){
            Optional<CaloriaPorIngredienteDTO> item = caloriasDTOS.stream()
                    .filter(caloriaPorIngredienteDTO -> caloriaPorIngredienteDTO.getName().equals(nombre))
                    .findFirst();
            if(item.isPresent()){
                resultado = item.get();
            } else{
                throw new IngredientNotFound(nombre);
            }

        }
        return resultado;
    }

    private List<CaloriaPorIngredienteDTO> loadDataBase() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:food.json");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CaloriaPorIngredienteDTO>> typeRef = new TypeReference<List<CaloriaPorIngredienteDTO>>() {};
        List<CaloriaPorIngredienteDTO> caloriasDTOS = null;
        try {
            caloriasDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return caloriasDTOS;

    }
}
