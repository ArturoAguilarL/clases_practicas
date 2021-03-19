package ej5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class pruebaEj5 {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(19,"marzo",2021);
        System.out.println(fecha.toString());
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: "+c1.getTime().toLocaleString());
    }
}
