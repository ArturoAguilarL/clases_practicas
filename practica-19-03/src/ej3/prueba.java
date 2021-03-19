package ej3;



public class prueba {

    public static void main(String[] args) {
        Libro libro = new Libro("El Señor de los Anillos", "1999", "Jk Rowlling");
        libro.prestamo();
        System.out.println(libro.toString());
    }
}
