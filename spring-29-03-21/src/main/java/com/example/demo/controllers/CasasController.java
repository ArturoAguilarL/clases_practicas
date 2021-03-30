package com.example.demo.controllers;

import com.example.demo.entities.Casa;
import com.example.demo.services.CasasServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/casas")
public class CasasController {
    @GetMapping("{casa}")
    public ResponseEntity obtenerCasa(@PathVariable String casa){
        return CasasServices.buscarCasa(casa);
    }

    /*
    @PostMapping("/metroscuadrados")
    public ResponseEntity calcularMetrosCuadrados(@RequestBody Casa casa){s
        return CasasServices.calcularMetrosCuadrados(casa);
    }*/

    @PostMapping("/metroscuadrados")
    public ResponseEntity calcularMetrosCuadrados(@RequestBody Casa casa){
        return new ResponseEntity(CasasServices.getTotalMetros(casa), HttpStatus.OK);
    }


    /*
    //Para hacer lo de inyeccion de dependencias con set es:
    private CasasServices casasServices;

    public void setCasasServices(CasasServices casasServices){
        this.casasServices = casasServices;
    }
    @PostMapping("/calculate")
    public Casa calculate(@RequestBody Casa casa){
        this.setCasasServices(new CasasServices());
        return new ResponseEntity(CasasServices.getTotalMetros(casa), HttpStatus.OK);
    }

     */

}
    

