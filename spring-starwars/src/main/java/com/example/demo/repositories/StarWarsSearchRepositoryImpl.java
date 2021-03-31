package com.example.demo.repositories;

import com.example.demo.dto.PersonajePorBusquedaDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class StarWarsSearchRepositoryImpl implements StarWarsSearchRepository {

    @Override
    public List<PersonajePorBusquedaDTO> buscarNombresSimilares(String nombre) {
        List<PersonajePorBusquedaDTO> pjDTOS = loadDataBase();
        List<PersonajePorBusquedaDTO> resultado = new ArrayList<>();
        if(pjDTOS != null){
            for(PersonajePorBusquedaDTO pj : pjDTOS) {
                if(pj.getName().contains(nombre))
                    resultado.add(pj);
            }
        }
        return resultado;
    }

    private List<PersonajePorBusquedaDTO> loadDataBase() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:starwars.json");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PersonajePorBusquedaDTO>> typeRef = new TypeReference<List<PersonajePorBusquedaDTO>>() {};
        List<PersonajePorBusquedaDTO> pjDTOS = null;
        try {
            pjDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pjDTOS;

    }
}
