package com.up.lab.tpo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuDTO {
    @JsonProperty("nombre_platillo")
    private String nombrePlatillo;

    @JsonProperty("precio")
    private double precio;

    @JsonProperty("descripcion")
    private String descripcion;

    // Getters y Setters

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
