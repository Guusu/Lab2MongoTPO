package com.up.lab.tpo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;

public class RestaurantDTO {
    @JsonProperty("id")
    private String id;

    @JsonProperty("nombre")
    private String nombreRestaurante;

    @JsonProperty("tipo_cocina")
    private String tipoCocina;

    @JsonProperty("direccion")
    private DireccionDTO direccion;

    @JsonProperty("telefono")
    private String numeroTelefono;

    @JsonProperty("horario")
    private HashMap<String,String> horario;

    @JsonProperty("menu")
    private List<MenuDTO> menu;

    @JsonProperty("capacidad_comensales")
    private int capacidadComensales;

    @JsonProperty("calificacion")
    private double calificacion;

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public DireccionDTO getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDTO direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public HashMap<String,String> getHorario() {
        return horario;
    }

    public void setHorario(HashMap<String,String> horario) {
        this.horario = horario;
    }

    public List<MenuDTO> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuDTO> menu) {
        this.menu = menu;
    }

    public int getCapacidadComensales() {
        return capacidadComensales;
    }

    public void setCapacidadComensales(int capacidadComensales) {
        this.capacidadComensales = capacidadComensales;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}

