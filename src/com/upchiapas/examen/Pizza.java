package com.upchiapas.examen;

public class Pizza {
    private String nombreP;
    private int precio;
    private Pedido pedido;
    public Pizza(String nombreP, int precio){
        this.nombreP = nombreP;
        this.precio = precio;
        this.pedido = pedido;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "'" + nombreP + '\'' +
                ", precio " + precio;
    }
}
