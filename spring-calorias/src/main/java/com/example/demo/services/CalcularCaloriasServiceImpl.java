package com.example.demo.services;

import com.example.demo.dto.CaloriaPorIngredienteDTO;
import com.example.demo.dto.IngredienteDTO;
import com.example.demo.dto.PlatoDTO;
import com.example.demo.dto.PlatoResponseDTO;
import com.example.demo.repositories.CaloriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CalcularCaloriasServiceImpl implements CalcularCaloriasService {

    @Autowired
    private final CaloriasRepository caloriaRepositorio;

    public CalcularCaloriasServiceImpl(CaloriasRepository caloriasRepositorio) {
        this.caloriaRepositorio = caloriasRepositorio;
    }

    private Double calcularCaloria(Double peso, String nombre){
        CaloriaPorIngredienteDTO caloriasPorIngrediente = caloriaRepositorio.encontrarCaloriaPorIngrediente(nombre);
        System.out.println("Calorias:"+caloriasPorIngrediente.getCalories());
        return (peso * caloriasPorIngrediente.getCalories()) / 100;
    }

    @Override
    public PlatoResponseDTO calcular(PlatoDTO plato) {
        PlatoResponseDTO response = new PlatoResponseDTO();
        Map<String, Double> caloriasPorIngrediente = new HashMap<>();
        double caloriasTotales = 0.0;
        double max = 0.0;
        IngredienteDTO ingredienteMasCalorias = null;

        for(IngredienteDTO i : plato.getIngredientes()){
            Double aux = calcularCaloria(i.getPeso(), i.getNombre());
            caloriasTotales += aux;
            caloriasPorIngrediente.put(i.getNombre(), aux);
            if(aux > max) {
                max = aux;
                ingredienteMasCalorias = i;
            }
        }

        response.setCaloriasTotales(caloriasTotales);
        response.setCaloriasPorIngrediente(caloriasPorIngrediente);
        response.setIngredienteConMasCalorias(ingredienteMasCalorias);

        return response;
    }
}
