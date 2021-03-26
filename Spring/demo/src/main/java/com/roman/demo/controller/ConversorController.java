package com.roman.demo.controller;

import com.roman.demo.entity.ConversorNumero;
import com.roman.demo.entity.MorseConversor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ConversorController {

    @GetMapping("/romano/{numero}")
    public String conversorNumero(@PathVariable() int numero){
        if(numero >= 3999)
            return "No se puede";
        return ConversorNumero.toRoman(numero);
    }

    @GetMapping("/morse/{codigo}")
    public ResponseEntity<MorseConversor> conversorMorse(@PathVariable() String codigo){
        MorseConversor morse = new MorseConversor();
        morse.setStringCodigo(MorseConversor.decode(codigo));
        return new ResponseEntity(morse, HttpStatus.ACCEPTED);
    }
    
}
