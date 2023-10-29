package com.up.lab.tpo.model;


import org.springframework.data.mongodb.core.mapping.Field;

public class Direccion {
    @Field
    private String calle;
    @Field
    private String ciudad;
    @Field
    private String estado;
    @Field(name = "codigo_postal")
    private String codigoPostal;

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}

