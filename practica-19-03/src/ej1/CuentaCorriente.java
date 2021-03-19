package ej1;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente(double valor){
        saldo = valor;
    }

    public CuentaCorriente(){}

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        saldo = cuentaCorriente.getSaldo();
    }

    public void ingreso(double monto){
        saldo += monto;
    }

    public void egreso(double monto){
        saldo -= monto;
    }

    public void reintrego(double monto){
        saldo += monto;
    }

    public void transferencia(double monto){
        saldo -= monto;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double s){
        this.saldo = s;
    }
}
