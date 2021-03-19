package ej3;

public class Libro {

    private String titulo;
    private String edicion;
    private String autor;
    private boolean prestado = false;

    public Libro(String titulo, String edicion, String autor){
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public void prestamo(){
        this.prestado = true;
    }

    public void devolucion(){
        this.prestado = false;
    }

    @Override
    public String toString(){
        return this.titulo + "," + this.autor + "," + this.edicion + ".";
    }
}
