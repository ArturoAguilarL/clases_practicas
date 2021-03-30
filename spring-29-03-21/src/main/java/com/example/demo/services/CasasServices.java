package com.example.demo.services;

import com.example.demo.entities.Casa;
import com.example.demo.entities.Habitacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CasasServices {
    public static ResponseEntity buscarPersonaje(String nombre) {
    return null;
    }

    public static ResponseEntity buscarCasa(String casa) {
        if(casa.equals("micasa")) {
            Casa house = new Casa("Mi Casa", "Migueletes 1234");
            return new ResponseEntity(house, HttpStatus.OK);
        }
        return null;
    }

    public static ResponseEntity calcularMetrosCuadrados(Casa casa){
        System.out.println("Hola miundo");
        System.out.println("Direccion"+ casa.getDireccion());
        metros(casa);
        habitacion(casa);
        valor(casa);
        System.out.println(casa.getMetrosCuadrados());

        return new ResponseEntity(casa, HttpStatus.OK);
    }

    public static double getTotalMetros(Casa casa){
        double total = 0;
        for (Habitacion hab:casa.getHabitaciones()) {
            total += hab.getAncho()*hab.getLargo();
            System.out.println("Ancho:"+ hab.getAncho() + "Largo:"+ hab.getLargo());
        }
        return total;
    }


    private static void metros(Casa casa) {
        if (casa.getHabitaciones() != null) {
            for (int i = 0; i < casa.getHabitaciones().size(); i++) {
                casa.getHabitaciones().get(i).setMetrosCuadrados(casa.getHabitaciones().get(i).getLargo() * casa.getHabitaciones().get(i).getAncho());
                if (casa.getMetrosCuadrados() != null) {
                    casa.setMetrosCuadrados(casa.getMetrosCuadrados() + casa.getHabitaciones().get(i).getMetrosCuadrados());
                } else {
                    casa.setMetrosCuadrados(0.0);
                    casa.setMetrosCuadrados(casa.getMetrosCuadrados() + casa.getHabitaciones().get(i).getMetrosCuadrados());
                }
            }
        }
    }


    private static void valor(Casa casa) {
        if (casa.getHabitaciones() != null && casa.getMetrosCuadrados() != null) {
            casa.setPrecio(800 * casa.getMetrosCuadrados());
        } else {
            metros(casa);
            casa.setPrecio(800 * casa.getMetrosCuadrados());
        }
    }

    private static void habitacion(Casa casa) {
        if (casa.getHabitaciones() != null) {
            Habitacion habitacionMasGrande = new Habitacion();
            habitacionMasGrande.setMetrosCuadrados(0.0);
            for (int i = 0; i < casa.getHabitaciones().size(); i++) {
                if (habitacionMasGrande.getMetrosCuadrados() < casa.getHabitaciones().get(i).getMetrosCuadrados()) {
                    habitacionMasGrande = casa.getHabitaciones().get(i);
                }
            }
            casa.setHabitacionMasGrande(habitacionMasGrande);
        }
    }
}
