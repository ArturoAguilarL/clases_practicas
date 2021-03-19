package ej2;

public class Contador {
    private int valor;
    public Contador(){

    }

    public Contador(Contador cont){
        this.valor = cont.getValor();
    }
    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        this.valor--;
    }

    public void setValor(int val){
        this.valor = val;
    }

    public int getValor(){
        return this.valor;
    }


}
