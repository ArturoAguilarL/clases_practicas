package com.example.demo.controllers;


import com.example.demo.dto.ErrorDTO;
import com.example.demo.dto.PlatoDTO;
import com.example.demo.dto.PlatoResponseDTO;
import com.example.demo.exceptions.IngredientNotFound;
import com.example.demo.services.CalcularCaloriasService;
import com.example.demo.services.CalcularCaloriasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CalculadoraCaloriasController {

    @Autowired
    private CalcularCaloriasServiceImpl calcularCaloriasService;
    
    @PostMapping("/calcular")
    public PlatoResponseDTO getCals(@RequestBody PlatoDTO plato) throws IngredientNotFound{
        return calcularCaloriasService.calcular(plato);
    }
    
    //Poner exepciones aca en el controlador
    @ExceptionHandler(IngredientNotFound.class)
        public ResponseEntity<ErrorDTO> handleException(IngredientNotFound errorException) {
            var error = new ErrorDTO(errorException.getMessage(), "Ingredient Not found");
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }

}
