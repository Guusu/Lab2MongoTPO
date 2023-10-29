package com.up.lab.tpo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Menu {
    @Field(name = "nombre_platillo")
    private String nombrePlatillo;
    @Field
    private double precio;
    @Field
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

