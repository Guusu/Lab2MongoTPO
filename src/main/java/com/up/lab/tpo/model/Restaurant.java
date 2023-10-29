package com.up.lab.tpo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashMap;
import java.util.List;

@Document(collection = "restaurants")
public class Restaurant {
    @Id
    private String id;
    @Field
    private String nombre;
    @Field(name = "tipo_cocina")
    private String tipoCocina;
    @Field
    private Direccion direccion;
    @Field
    private String telefono;
    @Field
    private HashMap<String,String> horario;
    @Field
    private List<Menu> menu;
    @Field(name = "capacidad_comensales")
    private int capacidadComensales;
    @Field
    private double calificacion;

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public HashMap<String,String> getHorario() {
        return horario;
    }

    public void setHorario(HashMap<String,String> horario) {
        this.horario = horario;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
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

