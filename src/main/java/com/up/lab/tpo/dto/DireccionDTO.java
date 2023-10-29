package com.up.lab.tpo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DireccionDTO {
    @JsonProperty("calle")
    private String nombreCalle;

    @JsonProperty("ciudad")
    private String nombreCiudad;

    @JsonProperty("estado")
    private String nombreEstado;

    @JsonProperty("codigo_postal")
    private String codigoPostal;

    // Getters y Setters

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
