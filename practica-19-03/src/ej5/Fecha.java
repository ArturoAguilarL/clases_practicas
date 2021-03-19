package ej5;

public class Fecha {
    private int dia;
    private String mes;
    private int año;
    private int hora;
    private int minutos;
    private int segundos;

    public Fecha(int dia, String mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(String mes){
        this.mes = mes;
    }

    public void setAño(int año){
        this.año = año;
    }

    public int getDia(){
        return this.dia;
    }
    public String getMes(){
        return this.mes;
    }
    public int getAño(){
        return this.año;
    }



    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.año + ".";
    }


}


/*
package ar.com.manflack.Clase4;
import java.util.GregorianCalendar;
public class Fecha {
    private GregorianCalendar calendar = new GregorianCalendar();
    public Fecha(int dia, int mes, int ano) {
        new Fecha(ano + "/" + mes + "/" + dia);
    }
    public Fecha(String fecha) {
        String[] values = fecha.split("/");
        System.out.println(values[0] + "/" + values[1] + "/" + values[2]);
        if (values.length != 3)
            System.out.println("La fecha no es valida");
        else
            calendar.set(Integer.parseInt(values[2]), Integer.parseInt(values[1]) - 1, Integer.parseInt(values[0]), 0, 0, 0);
    }
    public static boolean esValida(String fecha) {
        String[] values = fecha.split("/");
        return values.length == 3;
    }
    @Override
    public String toString() {
        return "Fecha: " + calendar.getTime();
    }
}
 */
