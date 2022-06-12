package com.tatianatab;

public class Automovil {

    private String nombre;
    private int año;
    private String modelo;
    private int capLlenado;
    private String tipo;

    public Automovil(String nombre, int año, String modelo, int capLlenado, String tipo) {
        this.nombre = nombre;
        this.año = año;
        this.modelo = modelo;
        this.capLlenado = capLlenado;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapLlenado() {
        return capLlenado;
    }

    public void setCapLlenado(int capLlenado) {
        this.capLlenado = capLlenado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre+" Año: "+año+" Modelo: " + modelo +" Cap de Llenado: " + capLlenado +" Tipo: " + tipo;
    }
}
