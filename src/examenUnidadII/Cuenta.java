package examenUnidadII;

public class Cuenta {
    private int numCuenta;
    public String titular;
    private double saldoActual;
    public String tipo;
    public boolean ver;

    //No pide tipo de cuenta
    public Cuenta() {
        this.ver = true;
    }

    public Cuenta(String titular, int numCuenta, double saldoInicial) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldoActual = saldoInicial;
        this.tipo = "General";
    }

    //Pide tipo de cuenta
//    GENERAL Y PREMIUM
    public Cuenta(String titular, int numCuenta, double saldoInicial, String tipo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldoActual = saldoInicial;
        this.tipo = tipo;
    }

    //Setters y getters
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void deposito(double deposito) {
        this.saldoActual += deposito;
    }

    public void retiro(int retiro) {
        this.saldoActual -= retiro;
    }


}
