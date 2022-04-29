package com.mycompany.deposito;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    public void operativa_cuenta(double retirarC, double ingresarC) {
        try {
            retirar (retirarC);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            ingresar(ingresarC);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
